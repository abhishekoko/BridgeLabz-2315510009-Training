package level2;
import java.util.Scanner;

class Ques8 {
 public static void main(String[] args) {
     Scanner scr = new Scanner(System.in);
     System.out.print("Enter a positive integer: ");
     int number = scr.nextInt();

     if (number > 0) {
         System.out.print("The factors of " + number + " are: ");
         int counter = 1;
         while (counter <= number) {
             // Check if the number is perfectly divisible by the counter
             if (number % counter == 0) {
                 System.out.print(counter + " ");
             }
             counter++;
         }
         System.out.println();
     } else {
         System.out.println("Please enter a positive integer.");
     }
     scr.close();
 }
}