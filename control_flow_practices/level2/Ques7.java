package level2;
import java.util.Scanner;

class Ques7 {
 public static void main(String[] args) {
     Scanner scr = new Scanner(System.in);
     System.out.print("Enter a positive integer: ");
     int number = scr.nextInt();

     if (number > 0) {
         System.out.print("The factors of " + number + " are: ");
         for (int i = 1; i <= number; i++) {
             // Check if the number is perfectly divisible by i
             if (number % i == 0) {
                 System.out.print(i + " ");
             }
         }
         System.out.println();
     } else {
         System.out.println("Please enter a positive integer.");
     }
     scr.close();
 }
}