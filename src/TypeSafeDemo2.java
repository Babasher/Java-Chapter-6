/* Type-Safe Input Demo2
 * MCS 141
 * 10/4/16
 * */

import java.util.Scanner;
public class TypeSafeDemo2 {
  
  
  public static void main (String [] args){
    int input;
    input = getInt("Enter an integer"); // calls getInt method to retrieve value
    System.out.println(input + " is an integer. Congratulations!");
    int input2 = getInt("Enter a second integer:");
    int input3 = getInt("Enter one more integer:");
    System.out.printf("You entered %d,%d, and %d. Good work!%n", input, input2, input3);
    } // end of main

  /* method to take a prompt as parameter and then return a valid integer */
  public static int getInt(String prompt) {
    Scanner scan = new Scanner(System.in);
    System.out.println(prompt); // display prompt
    while (!scan.hasNextInt()){
     String garbage = scan.nextLine();
     System.out.println( garbage + " is not an integer.");
     System.out.println(prompt);
    }// end looop
     int input = scan.nextInt();
     return input;
  } //end of getInt

}