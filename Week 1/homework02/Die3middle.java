import java.util.Random;


/*
Write a program that includes a method to simulate throwing one die (i.e. a random number 1..6).
Include a second method that throw 3 dice. This method will then sum the middle value (in order) and
return it to the main calling routine.

Note: Consider the following variations: (2,3,1) → 2 (4,1,4) → 4 (3,3,3) → 3
 */

public class Die3middle
{
    public static void main(String[] args)
    {
        // Test call to method
        System.out.println("The mean of your dice throws is " + middle3of5dice());
    }

    // This method simulates throwing three dice and returns the middle-valided die throw
    public static int middle3of5dice()
    {
        int x, y, z;
        int meanDie;

        // Your code here
        x =  throwDie();
        y = throwDie();
        z = throwDie();

        meanDie = (x + y + z) / 3;


        return meanDie;
    }


    // This method simulates throwing one die
    public static int throwDie()
    {
        int theThrow = 0;
        Random rand = new Random();

        // Your code here
        theThrow = rand.nextInt(7);
        System.out.println("Your die throw is " + theThrow);

        return theThrow;
    }

}