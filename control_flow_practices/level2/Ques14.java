package level2;
import java.util.Scanner;

class Ques14 {
 public static void main(String[] args) {
     Scanner scr = new Scanner(System.in);

     System.out.print("Enter the base number: ");
     int number = scr.nextInt();
     System.out.print("Enter the power (positive integer): ");
     int power = scr.nextInt();

     long result = 1;
     int counter = 0;

     if (power >= 0) {
         while (counter < power) {
             // Multiply the result by the number
             result *= number;
             counter++;
         }
         System.out.println(number + " to the power of " + power + " is: " + result);
     } else {
         System.out.println("Power must be a positive integer.");
     }
     scr.close();
 }
}