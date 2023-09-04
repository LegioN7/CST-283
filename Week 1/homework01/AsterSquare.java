// Delta College - CST 283 - Homework 1
// Name:  

public class AsterSquare {
   public static void main(String[] args) {
      drawSquare(1);
      System.out.println("------------");
      drawSquare(2);
      System.out.println("------------");
      drawSquare(3);
      System.out.println("------------");
      drawSquare(5);
      System.out.println("------------");
      drawSquare(7);
      System.out.println("------------");
   }

   // Method drawSquare

   static int drawSquare(int x) {
      for (int i = 0; i < x; i++) {
         if (x == 2) {
            System.out.println(x);
            System.out.println("**");
            System.out.println("**");
            x = 2;
         } else if (x == 3) {
            System.out.println(x);
            System.out.println("***");
            System.out.println("* *");
            System.out.println("***");
            x = 3;
         } else if (x == 4) {
            System.out.println(x);
            System.out.println("****");
            System.out.println("*  *");
            System.out.println("*  *");
            System.out.println("****");
            x = 4;
         } else if (x == 5) {
            System.out.println(x);
            System.out.println("*****");
            System.out.println("*   *");
            System.out.println("*   *");
            System.out.println("*   *");
            System.out.println("*****");
            x = 5;
         } else if (x == 6) {
            System.out.println(x);
            System.out.println("******");
            System.out.println("*    *");
            System.out.println("*    *");
            System.out.println("*    *");
            System.out.println("*    *");
            System.out.println("******");
            x = 6;
         } else if (x == 7) {
            System.out.println(x);
            System.out.println("*******");
            System.out.println("*     *");
            System.out.println("*     *");
            System.out.println("*     *");
            System.out.println("*     *");
            System.out.println("*     *");
            System.out.println("*******");
            x = 7;
         } else if (x == 8) {
            System.out.println(x);
            System.out.println("********");
            System.out.println("*      *");
            System.out.println("*      *");
            System.out.println("*      *");
            System.out.println("*      *");
            System.out.println("*      *");
            System.out.println("*      *");
            System.out.println("********");
            x = 8;
         } else if (x == 9) {
            System.out.println(x);
            System.out.println("*********");
            System.out.println("*       *");
            System.out.println("*       *");
            System.out.println("*       *");
            System.out.println("*       *");
            System.out.println("*       *");
            System.out.println("*       *");
            System.out.println("*       *");
            System.out.println("*********");
            x = 9;
         } else if (x == 10) {
            System.out.println(x);
            System.out.println("**********");
            System.out.println("*        *");
            System.out.println("*        *");
            System.out.println("*        *");
            System.out.println("*        *");
            System.out.println("*        *");
            System.out.println("*        *");
            System.out.println("*        *");
            System.out.println("*        *");
            System.out.println("**********");
            x = 10;
         } else if (x == 1 || x > 10) {
            System.out.println("?");
         }
      }
      return x;
   }
}