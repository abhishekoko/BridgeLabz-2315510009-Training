package Level1;
import java.util.Scanner;

public class Ques12 {
 public static void main(String[] args) {
     Scanner scr = new Scanner(System.in);
     System.out.print("Enter a natural number: ");
     int number = scr.nextInt();
     if (number > 0) {
         // Compute using formulae
         int sumFormula = number * (number + 1) / 2;

         // Compute using while loop
         int sumWhile = 0;
         int i = 1;
         while (i <= number) {
             sumWhile += i;
             i++;
         }

         // Compare the two results and print the result
         if (sumFormula == sumWhile) {
             System.out.println("The results from both computations were correct.");
         } else {
             System.out.println("TThe results from both computations were not correct.");
         }
     } else {
         System.out.println("The number " + number + " is not a natural number.");
     }
     scr.close();

 }
}
