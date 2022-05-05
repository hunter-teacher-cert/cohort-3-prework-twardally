import java.io.*;
import java.util.*;

public class RealTriangle {
    public static void main(String[] args){
      // sides of a triangle
      Scanner in = new Scanner(System.in);
          
        
        int s1;
        int s2;
        int s3;
           
        System.out.print("Type a number for Side1:  ");
          s1 = in.nextInt();
          in.nextLine();  // read the newline
      
        System.out.print("Type a number for Side2:  ");
          s2 = in.nextInt();
          in.nextLine();  // read the newline

        System.out.print("Type a number for Side3:  ");
          s3 = in.nextInt();
          in.nextLine();  // read the newline
      
        isTriangle(s1, s2, s3);
      }
       public static void isTriangle(int s1, int s2, int s3) {
      if (((s1 + s2) > s3) && ((s1 + s3) > s2) && ((s2 + s3) > s1)) {
        System.out.println("The triangle is a true triangle");
        System.out.println("true");
      } else {
        System.out.println("The triangle is not a true triangle");
        System.out.println("false");
        }
      }
       

}  