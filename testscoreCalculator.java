import java.util.Scanner;
import static java.lang.Math.max;
/* This program gathers 5 scores for students, curves, averages, 
calculates highest score and displays them.*/

public class testscoreCalculator
   {
      public static void main(String[] args){
      
         //creating a final array
         final int STUDENTS = 5; 
         int[] scores = new int[STUDENTS];
         //creating scanner object
         Scanner input = new Scanner(System.in);
         //Asking user scores for 5 students 
         System.out.println("Enter the score for Student 1: ");
         scores[0] = input.nextInt();
         
         System.out.println("Enter the score for Student 2: ");
         scores[1] = input.nextInt();
         
         System.out.println("Enter the score for Student 3: ");
         scores[2] = input.nextInt();
         
         System.out.println("Enter the score for Student 4: ");
         scores[3] = input.nextInt();
         
         System.out.println("Enter the score for Student 5: ");
         scores[4] = input.nextInt();
         
         
         int max = scores[0];
         //loop to calculate highest score  
         for (int index = 1; index < scores.length; index++)
          {
            if (scores[index] > max)
               max = scores[index];
          }
          System.out.println("The highest score is "+max);
          //calculating curve
          if (max != 100)
          {
            int curve = 100-max;
            System.out.println("The curve will be "+curve + " points");
            scores[0]+=curve;
            scores[1]+=curve;
            scores[2]+=curve;
            scores[3]+=curve;
            scores[4]+=curve;
          }
         
         double sum = 0;
         double avg;
         //loop to calculate average
         for (int index = 0; index < scores.length; index++)
         {
            sum += scores[index];
            
         }
            //average final calculation
            avg = sum / scores.length;
          //Displaying students scores curved or not
          System.out.println("The score for student 1: "+scores[0]);
          System.out.println("The score for student 2: "+scores[1]);
          System.out.println("The score for student 3: "+scores[2]);
          System.out.println("The score for student 4: "+scores[3]);
          System.out.println("The score for student 5: "+scores[4]);
          //to create a space
          System.out.println(" ");
          //Display the average score
          System.out.println("The Average score is: "+avg);
     }
   }