import java.io.*;
import java.util.*;

public class Ackermann {
    public static void main(String[] args){
      int m = 3;
      int n = 2;
      int result = ack(m, n);     
      System.out.println(result);

    }
   

    public static int ack(int m, int n) {
      if (m == 0){
        int result = n + 1;
        return result;
      }

      if ((m > 0)  &&  (n == 0)){
        int result = m - 1;
        ack(result, 1);
        return result;
      }


      if ((m > 0)  &&  (n > 0)){
        int result = m - 1;
        int result1 = n - 1 ;
        int d = ack(result,result1);
        int e = ack(result,result1-1);
        return e;
      }
      return 0;
    }
}