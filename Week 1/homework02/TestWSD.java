// Delta College - CST 283 - Homework 1
// Name:  

import java.util.Scanner;
public class TestWSD
{
   public static void main(String[] args)
   {
      System.out.println( wsd(1776) );
   }

   // -------------------------------------------------
   // Method wsd(int)
   public static int wsd(int x)
   {

      // Converts the 1776 Int to String
      // Length of the String is looped, and then the weight is identified
      String stringNum = Integer.toString(x);
      int sum;

      sum = 0;

      for(int i = stringNum.length(); i != 0; i--)
      {
         sum += x % 10 * i;
         x /= 10;
      }
      return sum;
   }
   
   
   
}
