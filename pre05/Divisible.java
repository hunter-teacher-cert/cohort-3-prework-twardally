import java.io.*;
import java.util.*;

public class Divisible {
    public static void main(String[] args){
      
      Scanner in = new Scanner(System.in);
          
        
        int m;
        int n;
        
           
        System.out.print("Type a number for value m:  ");
          m = in.nextInt();
          in.nextLine();  // read the newline
      
        System.out.print("Type a number for n:  ");
          n = in.nextInt();
          in.nextLine();  // read the newline

              
        isDivisible(m, n);
      }
       public static void isDivisible(int m, int n) {
      if ((n % m) == 0)  {
               System.out.println("true");
      } else {
                System.out.println("false");
        }
      }
       

}  