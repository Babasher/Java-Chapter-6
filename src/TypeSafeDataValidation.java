/* Type safe input w/ data validation
 * MCS 141
 * 10/6/16
 * */

import java.util.Scanner;

public class TypeSafeDataValidation {
  public static void main (String [] args) {
    int input;
    Scanner scan = new Scanner(System.in);
     
    //outer loop for validation
    do {
      System.out.println("Please enter a positive integer:");
      //enter type-safe loop
      while ( !scan.hasNextInt() ) {
        String garbage = scan.nextLine();
        System.out.println(garbage + " is not an integer.  Please enter a positive integer:");
      } // end of while loop
      input = scan.nextInt();
      scan.nextLine(); // clear the new line character sitting in the input stream
    } while ( ! (input > 0) ); // could be replaced with input >= 0
    // the rest of your code goes here
    System.out.println("Good work, " + input + " is a positive integer.");
  }
}