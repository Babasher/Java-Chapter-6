/* Type-Safe Input Demo3
 * Using helper class for input
 * MCS 141
 * 10/4/16
 * */

import java.util.Scanner;
public class TypeSafeDemo3 {
  
  
  public static void main (String [] args){
    int input;
    input = TypeSafeIn.getInt("Enter an integer"); // calls getInt method to retrieve value
    System.out.println(input + " is an integer. Congratulations!");
    int input2 = TypeSafeIn.getInt("Enter a second integer:");
    int input3 = TypeSafeIn.getInt("Enter one more integer:");
    System.out.printf("You entered %d,%d, and %d. Good work!%n", input, input2, input3);
    } // end of main

}