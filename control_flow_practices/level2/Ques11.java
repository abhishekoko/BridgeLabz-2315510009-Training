package level2;
import java.util.Scanner;

class Ques11 {
 public static void main(String[] args) {
     Scanner scr = new Scanner(System.in);

     System.out.print("Enter a positive number: ");
     int number = scr.nextInt();

     // Check if the number is a positive integer and less than 100
     if (number > 0 && number < 100) {
         System.out.println("Multiples of " + number + " below 100 are: ");
         for (int i = 1; i < 100; i++) {
             // Check if i is a multiple of the number
             if (i % number == 0) {
                 System.out.print(i + " ");
             }
         }
         System.out.println();
     } else {
         System.out.println("Please enter a positive number less than 100.");
     }
     scr.close();
 }
}
