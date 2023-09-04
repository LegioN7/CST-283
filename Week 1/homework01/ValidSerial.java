// Delta College - CST 283 - Homework 1
// Name:  

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidSerial {
   public static void main(String[] args) {

      System.out.println(isSerialValid("AB123"));
      System.out.println(isSerialValid("Ax123"));
      System.out.println(isSerialValid("XY123"));
      System.out.println(isSerialValid("AB12"));
      System.out.println(isSerialValid("ABC1234"));
      System.out.println(isSerialValid("BA143"));
      System.out.println(isSerialValid("BA12X"));
   }

   /*
    * True
    * False
    * False
    * False
    * False
    * True
    * False
    * 
    * 
    */

   public static boolean isSerialValid(String serialNum) {

      boolean outcome = false;

      for (int i = 0; i < 6; i++) {

         int z = serialNum.length();

         Pattern serialCorrect = Pattern.compile("^[A-C][A-Z][1-2][0-9]{2}$");
         Matcher serialMatch = serialCorrect.matcher(serialNum);

         if (serialMatch.find()) {

            outcome = true;

         } else if (z != 5) {

            outcome = false;
            break;

         }
      }

      return outcome;
   }

}
