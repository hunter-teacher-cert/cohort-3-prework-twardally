import java.io.*;
import java.util.*;

public class Array {
    public static void main(String[] args)
        {
      
      Scanner in = new Scanner(System.in);
        int n;
        double[] a = {1.0, 2.0, 3.0, 4.0};
        double[] newA = {0.0, 0.0, 0.0, 0.0};
              
          
        System.out.print("Type a number for n:  ");
          n = in.nextInt();
          //in.nextLine();  // read the newline


        //System.out.println(powArray(n, a, newA)); prints the values on separate lines
          double[] result = powArray(n,a, newA);
        //System.out.println(Arrays.toString(result)); prints the values of the returned array in the brackets as values of an array

          for (int i =0; i < result.length; i++){
          System.out.println(result[i]); //prints the values of the returned array on separate lines 
            }
          }
        
          public static double[] powArray(int n, double[] a, double[] newA)
        {
        
           for (int i =0; i < a.length; i++){
                 newA[i] = Math.pow(a[i], n);
                   
                
             }       
                   
          return newA;
        }

}




