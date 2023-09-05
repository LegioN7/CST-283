// Delta College - CST 283 - Homework 1
// Name:  

import java.io.*;
import java.util.*;

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
            }
            numCoords = i;
            inputFile.close();
        }

        catch (IOException e) // If file error, display message and crash
        {
            System.out.println("File error.");
            System.exit(0);
        }

        // Invoke method to determine axes range.
        writeAxes(xVals, yVals, numCoords);
    }

    // This method receives parallel integer arrays of (x,y) coordinates.
    // It seeks the max and min of each set in order to define graphing axes ranges.
    // Arrays contain 'n' elements.
    public static void writeAxes(int xVals[], int yVals[], int numCoords) {
        int minX = 999;
        int maxX = -999;
        int minY = 999;
        int maxY = -999;

        // Process arrays to seek min and max for both
        Arrays.sort(xVals);
        Arrays.sort(yVals);

        int smallestX = xVals[0];
        int biggestX = xVals[0];
        // Enter your new code here
        for (int i = 0; i < xVals.length; i++) {
            if (xVals[i] < smallestX)
                smallestX = xVals[i];
            if (xVals[i] > biggestX)
                biggestX = xVals[i];
        }

        int smallestY = yVals[0];
        int biggestY = yVals[0];
        // Enter your new code here
        for (int i = 0; i < yVals.length; i++) {
            if (yVals[i] < smallestY)
                smallestY = yVals[i];
            if (yVals[i] > biggestY)
                biggestY = yVals[i];
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