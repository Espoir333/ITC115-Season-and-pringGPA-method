/****************************************************
 * This Program creates and demonstrates the method *
 * season Sum which returns season name.            *
 *                                                  *
 * Compile: javac seasonDemo.java                   *                                                   *
 * Run    : java seasonDemo                         *
 ****************************************************/

/***************************************************
 * Class used   : seasonDemo                       *
 * Method used  : season                           *
 * Input Data   : Two integers.                    *
 * Out put Data : Displays season name.            *
 **************************************************/

/* Importing the io package for input and output and
     util for scanner class to scan input data */

import java.io.*;
import java. util. Scanner;

public class seasonDemo
{
     public static void main (String[]args)
     {
        //variable declaration
         int month, day:

        // Declaring scanner object
        Scanner input=new Scanner (System. in);

        //inputting month value
        System. out. print ("Enter month:");
        month-input.nextInt ();

        //inputting day value
        System. out. print ("Enter day: ")
        day-input. nextInt () ;

       //Displays season string value
       System. ou2t.println (season (month, day) + " Season");

   }     

   /* Method accepts two input parameters month,
    * day and returns string representing season*/
   public static String season(int month, int day)
   {
      String sesn;
      if (month < 3 || month == 3 && day <= 15 ) )
      {
          sesn-"winter";

      }
      else if (month < 6 || (month == 6 && day <= 15))
      {
         sesn="Spring";
      }
      else if (month < 9 || (month == 9 & & day <= 15 ))
      {
         sesn="Summer";
      }
      else if (month < 12 || (month == 12 && day <= 15))
      {
         sesn"Fall";
      }
      else
      {
         sesn ="Winter";
      }
      return sesn;
   }
}
