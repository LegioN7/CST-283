// Delta College - CST 283 - Homework 1
// Name:  Aaron Pelto

public class TestLove5 {
   public static void main(String[] args) {

      System.out.println(love5(5, 4));
      System.out.println(love5(1, 6));
      System.out.println(love5(3, 5));
      System.out.println(love5(9, 4));

      System.out.println(love5(4, 4));
      System.out.println(love5(7, 3));

   }

   // Method love5

   static boolean love5(int i, int x) {

      if (i == 5 || x == 5) {
         return true;
      } else if (Math.abs(i - x) == 5) {
         return true;
      } else {
         return false;
      }
   }
}