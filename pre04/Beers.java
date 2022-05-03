import java.io.*;
import java.util.*;

public class Beers {
    public static void main(String[] args){
        // pick a random number
        int n = 100;
          nLines(n);
      }
       public static void nLines(int n) {
    if (n > 0) {
        System.out.println();
        nLines(n - 1);
      
      System.out.println(n + " bottles of beer on the wall,");                            System.out.println(n + " bottles of beer,");
      System.out.println("ya' take one down, ya pass it around,");                        System.out.println(n + " bottles of beer on the wall,");
          
    }
                                
    if (n == 1) {                            
      System.out.println(" No bottles of beer on the wall,");
      System.out.println(" No bottles of beer,");
      System.out.println(" ya' can't take one down, ya can't pass it around,");
      System.out.println(" 'cause there are no more bottles of beer on the wall!");
      }   
         }

}  