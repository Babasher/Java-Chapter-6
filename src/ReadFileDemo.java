/* Reading data from a file
 * MCS 141
 * 10/6/16
 * */
import java.util.Scanner;
import java.io.File; // the File class manages interactions with files
import java.io.IOException; //because mistakes can happen.....

public class ReadFileDemo{
  public static void main (String[] args) throws IOException {
    double average;
    int sum = 0;
    int count = 0;
    int number;
    
    File inputFile = new File("numbers.txt"); // handles interactions with text file
    Scanner scan = new Scanner (inputFile); // link Scanner to File object
    
    while( scan.hasNextInt() ){ // keep running while we can see data
      number = scan.nextInt();
      sum = sum + number;
      count++;
    }
    
   average = (double)sum/count;
   System.out.println("The average is " + average);
  }
  
}