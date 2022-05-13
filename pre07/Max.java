import java.io.*;
import java.util.*;

public class Max {
    public static void main(String[] args)
        {
      
      
        int[] n = {6,2,1,8,9,0};
        
              
          
        
          System.out.println(indexOfMax(n));
           
          }
        
          public static int indexOfMax(int[] n){
                              
          int max = 0;   
          for (int value : n) {
              
                
                  if (value > max){
                    max = value;
                    }
          }
             return max;    
               
             }       
        
       
        
}




