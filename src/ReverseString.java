/* Reverse String Demo
 * MCS 141
 * 10/11/16
 * */

import java.util.Scanner;
public class ReverseString {
  public static void main(String [] args){
    Scanner scan = new Scanner(System.in);
    String input;
    String output= "";
    System.out.println("Please enter a phrase:");
    input = scan.nextLine();
    
    //option #1
    for(int i = 0; i < input.length(); i ++)
    {
      output = output + input.charAt( input.length() -1 - i);
      //System.out.println(output);//for testing
      
    }
    System.out.println("The reversed phrase is: " +output);
    
    //option #2
    output = "";
    for(int i = 0; i < input.length(); i ++)
    {
      output = input.charAt( i ) + output;
      System.out.println(output);//for testing
      
    }
    System.out.println("The reversed phrase is: " +output);
    
    
    //option #3
    for(int i = input.length() -1 ; i >= 0; i --)
    {
      output = output + input.charAt(i);
      //System.out.println(output);//for testing
    }
    System.out.println("The reversed phrase is: " +output);
    
  }
  
}