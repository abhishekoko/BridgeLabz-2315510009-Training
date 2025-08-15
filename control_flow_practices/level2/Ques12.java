package level2;
import java.util.Scanner;

class Ques12 {
 public static void main(String[] args) {
     Scanner scr = new Scanner(System.in);

     System.out.print("Enter the base number: ");
     int number = scr.nextInt();
     System.out.print("Enter the power (positive integer): ");
     int power = scr.nextInt();

     long result = 1;

     if (power >= 0) {
         for (int i = 1; i <= power; i++) {
             // Multiply the result by the number
             result *= number;
         }
         System.out.println(number + " to the power of " + power + " is: " + result);
     } else {
         System.out.println("Power must be a positive integer.");
     }
     scr.close();
 }
}