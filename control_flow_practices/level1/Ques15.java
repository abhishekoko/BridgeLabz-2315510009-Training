package Level1;
import java.util.Scanner;

public class Ques15 {
 public static void main(String[] args) {
     Scanner scr = new Scanner(System.in);

     System.out.print("Enter a positive integer: ");
     int number = scr.nextInt();

     if (number >= 0) {
         long factorial = 1;

         // Calculating the factorial
         for (int i = 1; i <= number; i++) {
             factorial *= i;
         }
         // Print the result
         System.out.println("The factorial of " + number + " is " + factorial);
     } else {
         System.out.println("Factorial is not defined for negative numbers.");
     }
     scr.close();

 }
}
