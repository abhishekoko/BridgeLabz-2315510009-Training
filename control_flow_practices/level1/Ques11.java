package Level1;
import java.util.Scanner;

public class Ques11 {
 public static void main(String[] args) {
     Scanner scr = new Scanner(System.in);

     double total = 0.0;
     System.out.println("Enter positive numbers to sum. Enter 0 or a negative number to stop.");

     while (true) {
         System.out.print("Enter a number: ");
         double number = scr.nextDouble();

         // Check if the user entered 0 or a negative number to break the loop
         if (number <= 0) {
             break;
         }
         total += number;
     }
     System.out.println("The total sum is: " + total);
     scr.close();

 }
}