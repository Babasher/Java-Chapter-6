/* Converting Binary Strings to Text
 * MCS 141
 * 10/11/16
 * */
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter; // used to write to files
import java.io.IOException;

public class BinaryToText {

  
  //method to convert a binary string to a single character
  //presuppose:  8-bit input
  public static char binaryToChar( String input ) { //input a binary String, output a char
    int total = 0;
    for (int i = 7; i >= 0; i--) {
      if (input.charAt(i) == '1') {
        total = total + (int)Math.pow(2,7 - i); // note that power needs to decrease as index increases
      }
    }
    return (char)total;
  }
  
  //convert binary String to text
  public static String binaryToString( String input ) {
    String output = "";
    for (int i = 0; i < input.length() ; i = i+8 ) { // iterate through blocks of 8
      String toConvert = input.substring(i, i+8);
      output = output + binaryToChar( toConvert ); // call previous method
    }
    return output;
  }
  
  //main method
  public static void main (String [] args) throws IOException {
    Scanner scan = new Scanner (System.in);
    String fileIn;
    String fileOut;
    String input;
    String output = "";
    
    System.out.println("Enter a file name to read:");
    fileIn = scan.nextLine();
    File readFile = new File( fileIn ); //file name provided by user
    Scanner read = new Scanner( readFile ); //Scanner linked to input file
    while ( read.hasNext() ) {
      input = read.nextLine(); // read input file
      output = output + binaryToString( input ); //call previous method
    }
    
    //set up file to write to
    System.out.println("Enter a file name to write:");
    fileOut = scan.nextLine();
    File writeFile = new File( fileOut );
    PrintWriter write = new PrintWriter( writeFile ); //link PrintWriter to output file
    //PrintWriter works just like System.out
    write.println( output ); //push output to file
    write.close(); // need to close output streams
  }
    
    
  
}
    