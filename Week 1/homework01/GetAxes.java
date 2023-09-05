// Delta College - CST 283 - Homework 1
// Name:  

import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class GetAxes {
    static final String FILENAME = "data.txt";
    static final int MAX_COORDS = 100;

    public static void main(String[] args) throws IOException {

        // Parallel arrays for (x,y) coordinates
        int[] xVals = new int[MAX_COORDS];
        int[] yVals = new int[MAX_COORDS];

        int numCoords = 0; // Counter for number of coordinates

        // Start file processing
        try {
            String filename = FILENAME;
            File dataFileRef = new File(filename);

            // Check for file existence. If not found, display error and crash
            if (!dataFileRef.exists()) {
                System.out.println("File was not found");
                System.exit(0);
            }

            Scanner inputFile = new Scanner(dataFileRef);

            // File processing loop. Build parallel arrays of (x,y) coordinates.
            int i = 0;
            while (inputFile.hasNext()) {
                xVals[i] = inputFile.nextInt();
                yVals[i] = inputFile.nextInt();
                i++;
            }
            numCoords = i;
            inputFile.close();
        }

        catch (IOException e) // If file error, display message and crash
        {
            System.out.println("File error.");
            System.exit(0);
        }

        int[] newxVals = IntStream.of(xVals).filter(i -> i != 0).toArray();
        int[] newyVals = IntStream.of(yVals).filter(i -> i != 0).toArray();

        // Invoke method to determine axes range.
        writeAxes(newxVals, newyVals, numCoords);
    }

    // This method receives parallel integer arrays of (x,y) coordinates.
    // It seeks the max and min of each set in order to define graphing axes ranges.
    // Arrays contain 'n' elements.
    public static void writeAxes(int newxVals[], int newyVals[], int numCoords) {
        int minX = 999;
        int maxX = -999;
        int minY = 999;
        int maxY = -999;

        // Process arrays to seek min and max for both
        Arrays.sort(newxVals);
        Arrays.sort(newyVals);

        int smallestX = newxVals[0];
        int biggestX = newxVals[0];
        // Enter your new code here
        for (int i = 0; i < newxVals.length; i++) {
            if (newxVals[i] < smallestX)
                smallestX = newxVals[i];
            if (newxVals[i] > biggestX)
                biggestX = newxVals[i];
        }

        int smallestY = newyVals[0];
        int biggestY = newyVals[0];
        // Enter your new code here
        for (int i = 0; i < newyVals.length; i++) {
            if (newyVals[i] < smallestY)
                smallestY = newyVals[i];
            if (newyVals[i] > biggestY)
                biggestY = newyVals[i];
        }

        minX = smallestX;
        maxX = biggestX;
        minY = smallestY;
        maxY = biggestY;

        System.out.println("x-axis: " + minX + " - " + maxX);
        System.out.println("y-axis: " + minY + " - " + maxY);
    }
}

/*
 * 
 * Arrays.sort(xVals);
 * 
 * int xMin = xVals[0];
 * int xMax = xVals[xVals.length - 1];
 * 
 * minX = xMin;
 * maxX = xMax;
 * System.out.println(minX);
 * System.out.println(maxX);
 * 
 * Arrays.sort(yVals);
 * 
 * int yMin = yVals[0];
 * int yMax = xVals[yVals.length - 1];
 * 
 * minY = yMin;
 * maxY = yMax;
 * System.out.println(minY);
 * System.out.println(maxY);
 */