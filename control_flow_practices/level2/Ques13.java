package level2;
import java.util.Scanner;

class Ques13 {
 public static void main(String[] args) {
     Scanner scr = new Scanner(System.in);

     System.out.print("Enter a positive number: ");
     int number = scr.nextInt();

     if (number > 0 && number < 100) {
         System.out.println("Multiples of " + number + " below 100 are: ");
         int counter = 1;
         while (counter < 100) {
             // Check if the counter is a multiple of the number
             if (counter % number == 0) {
                 System.out.print(counter + " ");
             }
             counter++;
         }
         System.out.println();
     } else {
         System.out.println("Please enter a positive number less than 100.");
     }
     scr.close();
 }
}