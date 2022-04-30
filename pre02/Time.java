import java.io.*;
import java.util.*;

public class Time {
    public static void main(String[] args){
        // exercise 3. #2 Assign values that are roughly the start time of 3:45:00 pm
          int startHour = 15;
          int startMin = 45;
          int startSecond = 0;

          int secsForDay = 86400;
          int secsForHour = 3600;
      
        // #3 Calculate and display the # of seconds since midnight
          int secsWhenStarted = ((secsForHour * startHour) + (startMin * 60));
          System.out.println(secsWhenStarted);
          System.out.print("The total seconds since midnight is ");
          System.out.println(secsWhenStarted);
          
        // #4 Calculate and display the number of seconds remaining in the day
          int secsLeftInDay = (secsForDay - secsWhenStarted);
          System.out.println(secsLeftInDay);
          System.out.print("The total seconds remaining in the day is ");
          System.out.println(secsLeftInDay);

      
        // #5 Calculate and display the percentage of the day
          double percentOfDay = (56700.00/86400.00);
          System.out.println(percentOfDay);
          System.out.print("The percentage of the day that has passed is ");
          System.out.println(percentOfDay);


        // #6 Current time values at 5:00:00pm. Elapsed time since start of this exercise
          int currentHour = 19;
          int currentMin = 0;
          int currentSecond = 0;
          int currentTotalSecs = (currentHour * secsForHour);
      
          int elapsedTime = (currentTotalSecs-secsWhenStarted);
          System.out.println(elapsedTime);
          System.out.print("The elapsed time from when I started this exercise is  ");                  System.out.println(elapsedTime);


      
          }
}