import java.io.*;
import java.util.*;

public class Sieve {
    public static void main(String[] args)
        {
      
        Scanner in = new Scanner(System.in);
        int n;
        System.out.print("type a number for n:  ");
          n =in.nextInt();

         
          
        
          System.out.println(sieve(n));
           
          }
        
          public static int sieve(int n){

          int chkNum = 0;
          int i = 0;  
          int newVal = n/2;   
          if (n==0||n==1) {
              System.out.println(n+ "is not a prime number");
            }else{
            for (i=2;i<=newVal;i++){
              if(n%i==0){ //modulo arithmetic
                System.out.println(n+ " is not prime number");
                  chkNum = 1;
                break;
              }
            }
            if(chkNum==0){
              System.out.println(n+ " is not prime number");
            }
            }

            return chkNum;
                             
    
       
        
}

}


