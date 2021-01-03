public class ForDemo {
  public static void main(String [] args) {
  
    //20 stars in a horizontal line
    for (int i = 0; i < 20; i++ ) {
      System.out.print('*');
    }
    // 'i' is no longer in scope after the loop
    //System.out.println(i);
    System.out.println();
     
    //revisit Perfect Squares
    int n;
    for (n = 1; n <= 10; n++) {
      System.out.println(n + " squared is " + n*n);
    }
    // 'n' is still available
    System.out.println("n is now " + n);
     
    //a block of stars
    for (int i = 0; i < 10; i++) {
      System.out.println("**********");
    }
    System.out.println();
     
    //using nested loops
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j<10 ; j++) {
        System.out.print("*");
      }// end of 'j' loop
      System.out.println();
    }// end of 'i' loop
    
    
    
    //using nested loops
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j<i+1 ; j++) {
        System.out.print("*");
      }// end of 'j' loop
      System.out.println();
    }// end of 'i' loop
 
    
    for(int i = 5; i >= 1 ; i--){
      for (int j = 1; j<=i; j++){
           System.out.println("*");
      }
    }

    
     
     
  } 
}