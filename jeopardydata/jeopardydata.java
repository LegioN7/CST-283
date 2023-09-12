import java.io.*;
import java.util.*;


// There is flexibility in the formatting of your information returned.
// Consider that some queries might produce a longer list and others very short.
// Queries must be validated prior to processing.
// First, validate that the format matches one of the patterns above.
// Then, be sure that the remaining query content includes the comma followed by the String parameter(s).
// For any queries that do not match this format, provide an error message and allow the user to start again.
// For your interface,use simple console input (via the Scanner class).
// Similarly, output can be directed to the Java console to restrict your Jeopardy data system to a command-line application.
// A simple query will likely generate a long list of Jeopardy questions/answers.
// Pull all matching entries from your data (stored in the array-based data structure) and list all that satisfy the query.
// Once all information has been displayed, be sure to return to the menu to give the user the option to perform another query or quit.
// Design your solution with appropriate modularity in mind. Either a procedural approach or an object-oriented are acceptable.

public class jeopardydata {
    static final String FILE_NAME = "jeopardydata.txt";

    public static void main(String[] args) {
        int menuInput = 0;

        Scanner scn = new Scanner(System.in);


        // List of Questions
        // Parse into each section
        // Turn it into a singular object
        List<JeopardyQuestion> questions = new ArrayList<>();
        try {
            File file = new File(FILE_NAME);
            if (file.exists()) {
                try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                    String line;
                    while ((line = br.readLine()) != null) {
                        if (!line.isEmpty()) {
                            /*
                             * If the line is empty - skip line
                             * parse string into JeopardyQuestion
                             * add question to list

                             */
                            JeopardyQuestion question = parseData(line);
                            questions.add(question);

                        }
                    }
                } catch (FileNotFoundException e) {
                    System.out.println("Something went wrong with the file input.");
                    System.exit(0);
                }
            }
        } catch (IOException e) {
            System.out.println("Something went wrong with the buffer");
            System.exit(0);
        }
        System.out.println("Welcome to the Jeopardy Data Search Program");
        do {

            System.out.println("Type 1 to Search by Date");
            System.out.println("Type 2 to Search by Category");
            System.out.println("Type 3 to Search by Keyword");
            System.out.println("Type 4 to Search Final Jeopardy by Year");
            System.out.println("Type 0 to Exit");

            // Read the next Int for Menu Input
            menuInput = scn.nextInt();

            switch (menuInput) {
                case 1:
                    System.out.println("Query the Date");

                    String queryDate;
                    queryDate = scn.next();

                    for (JeopardyQuestion d : questions)
                        if (d.getShowDate().contains(queryDate))
                            System.out.println(d);

                case 2:
                    System.out.println("Enter your Category");
                    System.out.println("Final Jeopardy!, Double Jeopardy!, or Jeopardy!");

                    String queryRound;
                    queryRound = scn.next();

                    do {
                        System.out.println("Invalid Entry - Please input a Category");
                        queryRound = scn.next();
                    } while (queryRound == "Final Jeopardy!" || queryRound == "Double Jeopardy!" || queryRound == "Jeopardy!");

                    for (JeopardyQuestion g : questions)
                        if (g.getRound().equals(queryRound))
                            System.out.println(g);
                    break;
                case 3:
                    System.out.println("Search by Keyword");

                    String queryKeyword;
                    queryKeyword = scn.next();

                    for (JeopardyQuestion g : questions)
                        if (g.getQuestion().contains(queryKeyword))
                            System.out.println(g);

                    for (JeopardyQuestion g : questions)
                        if (g.getAnswer().contains(queryKeyword))
                            System.out.println(g);
                    break;
                case 4:
                    System.out.println("Search Final Jeopardy by Year");

                    String fjDate;
                    fjDate = scn.next();
                    do
                    {
                        System.out.println("Invalid Entry - Please input a year.");
                        fjDate = scn.next();
                    } while (fjDate.length()>4);

                    for (JeopardyQuestion d : questions)
                        if (d.getShowDate().contains(fjDate) && d.getRound().contains("Final Jeopardy!"))
                            System.out.println(d);
                    break;
                case 0:
                    System.out.println("Thanks for using Jeopardy Data Search!");
                    break;
                default:
                    System.out.println("Invalid Choice\n");
            }
        } while (menuInput != 0);
    }


    static JeopardyQuestion parseData(String parseString) {

        String showDate;
        String round;
        String category;
        String value;
        String questionText;
        String answer;


        // Add the real values of the question from the current line
        // The line is the string, and split | puts it into parts

        String[] parts = parseString.split("\\|");
        showDate = parts[0];
        round = parts[1];
        category = parts[2];
        value = parts[3];
        questionText = parts[4];
        answer = parts[5];

        return new JeopardyQuestion(showDate, round, category, value, questionText, answer);
    }

}

//JeopardyQuestion firstQuestion = questions.get(0);
// System.out.println(firstQuestion.getShowDate());
