package level2;
import java.util.Scanner;

class Ques9 {
 public static void main(String[] args) {
     Scanner scr = new Scanner(System.in);

     System.out.print("Enter an integer greater than 1: ");
     int number = scr.nextInt();

     int greatestFactor = 1;

     if (number > 1) {
         for (int i = number / 2; i >= 1; i--) {
             //Check if the number is perfectly divisible by i
             if (number % i == 0) {
                 greatestFactor = i;
                 break;
             }
         }
         System.out.println("The greatest factor of " + number + " besides itself is " + greatestFactor);
     } else {
         System.out.println("Please enter an integer greater than 1.");
     }
     scr.close();
 }
}