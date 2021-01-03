/* Type-Safe Input Demo
 * MCS 141
 * 10/4/16
 * */

import java.util.Scanner;

public class TypeSafeDemo {
  public static void main (String [] args) {
    int input;
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Please enter an integer:"); // display prompt
    while ( !scan.hasNextInt() ) {
     //scan.nextLine(); // read input stream and discard
     String garbage = scan.nextLine();
     System.out.println( garbage + " is not an integer.");
     System.out.println("Please enter an integer:");
     // end looop
    }
    input = scan.nextInt(); //gaurenteed to work
    System.out.println(input + " is an integer. Congratulations!");
  }
}