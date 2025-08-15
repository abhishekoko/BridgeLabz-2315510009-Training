package Level1;
import java.util.Scanner;

public class Ques16 {
 public static void main(String[] args) {
     Scanner scr = new Scanner(System.in);
     System.out.print("Enter a natural number: ");
     int number = scr.nextInt();

     if (number > 0) {
         // Using a for loop, iterate from 1 to the number
         for (int i = 1; i <= number; i++) {
             // In each iteration, print if the number is odd or even
             if (i % 2 == 0) {
                 System.out.println(i + " is an even number.");
             } else {
                 System.out.println(i + " is an odd number.");
             }
         }
     } else {
         System.out.println("Please enter a natural number (greater than 0).");
     }
     scr.close();

 }
}
