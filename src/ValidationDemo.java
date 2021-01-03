/* Date validation demo
 * Make sure if a character is a letter
 * MCS 141
 * 10/4/16
 * */

import java.util.Scanner;

public class ValidationDemo{
  public static void main(String [] args)
  {
    Scanner scan = new Scanner(System.in);
    String input;
    //char input;
    char inputChar;
    System.out.println("Please enter a letter:");
    input = scan.nextLine(); //read input
    inputChar = input.charAt(0); // extract first character
    // while input is not a letter, try again
    
    while( !( (inputChar>= 'a' && inputChar <= 'z' || (inputChar >= 'A' && inputChar <= 'Z') ))) {
      System.out.println("Please enter a letter:");
      input = scan.nextLine(); //read input
      inputChar = input.charAt(0);
      
    }
    System.out.println("You entered" + inputChar);
  }
}
  
