import java.io.*;
import java.util.*;

public class Loops {
    public static void main(String[] args)
        {
      
      //Scanner in = new Scanner(System.in);
        double a = 9.0;
        double n = 6.0;
        double n1 = 0.0;
        double chkNum = 0.0;
        
        System.out.println(squareRoot(n, a, n1, chkNum)); 
          
        //System.out.print("Type a number for n:  ");
          //n = in.nextDouble();
          //in.nextLine();  // read the newline
           
        
          }
   
        public static double squareRoot(double n, double a, double n1, double chkNum)
        {
        do {
           
          n1 = (n + a/n)/2;
          
          chkNum = Math.abs(n1 - n);
          n = n1;
         System.out.println(n);
                    
          }while (chkNum > 0.0001);
          
          return n1;
        }

}




