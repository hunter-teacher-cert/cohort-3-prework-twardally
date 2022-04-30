import java.io.*;
import java.util.*;

public class Guess {
    public static void main(String[] args){
        // pick a random number
          int guessNum;
          int randomNum;
          int offNum;

          Scanner in = new Scanner(System.in);
          Random random = new Random();
          randomNum = random.nextInt(100) + 1;

          
          System.out.print("Type a number:  ");
          guessNum = in.nextInt();
          in.nextLine();  // read the newline

      
          System.out.print("Your guess is:  ");
          System.out.println(guessNum);
      
          System.out.print("The number I was thinking of is:  ");
          System.out.println(randomNum);

      
          offNum = guessNum - randomNum;
          System.out.print("You were off by:  ");
          System.out.println(offNum);
              
               
              
          }
}