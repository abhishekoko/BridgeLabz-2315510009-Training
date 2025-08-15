package level2;
import java.util.Scanner;

class Ques10 {
 public static void main(String[] args) {
     Scanner scr = new Scanner(System.in);

     System.out.print("Enter an integer greater than 1: ");
     int number = scr.nextInt();

     int greatestFactor = 1;

     if (number > 1) {
         int counter = number / 2;
         while (counter >= 1) {
             // Check if the number is perfectly divisible by the counter
             if (number % counter == 0) {
                 greatestFactor = counter;
                 break;
             }
             counter--;
         }
         System.out.println("The greatest factor of " + number + " besides itself is " + greatestFactor);
     } else {
         System.out.println("Please enter an integer greater than 1.");
     
     }
     scr.close();
 }
}