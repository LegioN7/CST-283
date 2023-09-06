import java.io.*;
import java.util.*;

public class jeopardydata {
    static final String filePath = "jeopardydata.txt";

    static String[] jepInput;
    static String[] jepDate;
    static String[] jepType;
    static String[] jepCategory;
    static String[] jepCost;
    static String[] jepQuestion;
    static String[] jepAnswer;

    public static void main(String[] args) {

        fillArrays(filePath);

    }

    private static void fillArrays(final String filePath) {
        List<String> fileLinesList = new ArrayList<>();
        try {
            File file = new File(filePath);
            if (file.exists()) {
                try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                    String strg;
                    while ((strg = br.readLine()) != null) {
                        // Make sure there is no blank line. If not
                        // then add line to List.
                        if (!strg.equals("")) {
                            fileLinesList.add(strg);
                        }
                    }
                }
            } else {
                throw new IllegalArgumentException("GetFileLinesCount() Method Error!\n"
                        + "The supplied file path does not exist!\n(" + filePath + ")");
            }

            System.out.println("File Line Size: " + fileLinesList.size());

            // Initialize all the Arrays...
            int lines = fileLinesList.size();
            jepDate = new String[lines];
            jepType = new String[lines];
            jepCategory = new String[lines];
            jepCost = new String[lines];
            jepQuestion = new String[lines];
            jepAnswer = new String[lines];

            // Fill all the Arrays...
            for (int i = 0; i < fileLinesList.size(); i++) {
                String[] lineArray = fileLinesList.get(i).split(",");
                jepDate[i] = lineArray[0];
                jepType[i] = lineArray[1];
                jepCategory[i] = lineArray[2];
                jepCost[i] = lineArray[3];
                jepQuestion[i] = lineArray[4];
                jepAnswer[i] = lineArray[5];
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (String z : jepDate)
            System.out.println(z);
    }
}

/*
 * int jepLines = 0;
 * 
 * try {
 * String filename = FILENAME;
 * File dataFileRef = new File(filename);
 * 
 * if (!dataFileRef.exists()) {
 * System.out.println("File was not found.");
 * System.exit(0);
 * }
 * 
 * Scanner inputFile = new Scanner(dataFileRef);
 * 
 * int i = 0;
 * while (inputFile.hasNext()) {
 * jepInput[i] = inputFile.nextLine();
 * i++;
 * }
 * 
 * jepLines = i;
 * inputFile.close();
 * } catch (IOException e) {
 * System.out.println("Error with file.");
 * System.exit(0);
 * }
 * 
 * for (String z : jepInput)
 * System.out.println(z);
 * }
 */