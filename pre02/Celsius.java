import java.io.*;
import java.util.*;

public class Celsius {
    public static void main(String[] args){
        // exercise 3. #2 Assign values that are roughly the start time of 3:45:00 pm
          double celsius;
          double fahrenheit;
          Scanner in = new Scanner(System.in);

          
          System.out.print("How many degrees is it in Celsius:  ");
          celsius = in.nextDouble();

          fahrenheit = (((celsius * 1.8) +32));
          
        
          System.out.printf("%.1f C = %.1f F", celsius, fahrenheit);

      
        


      
          }
}