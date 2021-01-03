/* Data validation demo using Do-While
 * Make sure a character is a letter
 * MCS 141
 * 10/6/16
 * */
import java.util.Scanner;

public class ValidationDemoDoWhile {
  public static void main (String [] args) {
    
    Scanner scan = new Scanner(System.in);
    String input;
    char inputChar;
    
    do {
      System.out.println("Please enter a letter:");
      input = scan.nextLine(); //read input
      input = input.toLowerCase();
      inputChar = input.charAt(0); //extract first character
      //while input is not a letter, try again
    } while ( !(inputChar >= 'a' && inputChar <= 'z') );
     
    System.out.println("You entered " + inputChar);
  }
}

