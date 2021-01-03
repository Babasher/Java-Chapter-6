/* Type Safe in Class
 * Used to manage input in other application
 * MCS 141
 * 10/4/16
 * */

import java.util.Scanner;
public class TypeSafeIn {
 
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
  
  
  public static double getDouble(String prompt) {
    Scanner scan = new Scanner(System.in);
    System.out.println(prompt); // display prompt
    while (!scan.hasNextDouble()){
     String garbage = scan.nextLine();
     System.out.println( garbage + " is not an double.");
     System.out.println(prompt);
    }// end looop
     double input = scan.nextDouble();
     return input;
  } //end of getDouble
  
  
  
  /* we could add getString, getChar, getLong, getBoolean, etc...
   * String and char would work differently than the others
   * */
     
  
  
  
  
}//end of class