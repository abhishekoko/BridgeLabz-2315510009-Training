package Level1;
import java.util.Scanner;

public class Ques13 {
 public static void main(String[] args) {
     Scanner scr = new Scanner(System.in);
     System.out.print("Enter a natural number: ");
     int number = scr.nextInt();
     if (number > 0) {
    	 
         // Compute using formula
         int sumFormula = number * (number + 1) / 2;

         // Compute using for loop
         int sumFor = 0;
         for (int i = 1; i <= number; i++) {
             sumFor += i;
         }

         // Compare the two results and print the result
         if (sumFormula == sumFor) {
             System.out.println("The results from both computations are correct.");
         } else {
             System.out.println("The results from both computations are not correct.");
         }
     } else {
         System.out.println("The number " + number + " is not a natural number.");
     }
     scr.close();

 }
}
