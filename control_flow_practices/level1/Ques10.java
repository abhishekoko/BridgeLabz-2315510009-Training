package Level1;
import java.util.Scanner;

public class Ques10 {
 public static void main(String[] args) {
     Scanner scr = new Scanner(System.in);

     double total = 0.0;

     System.out.println("Enter numbers to sum, enter 0 to stop.");
     System.out.print("Enter a number: ");
     double number = scr.nextDouble(); // Variable to store user input

     // Loop will continue as long as the user does not enter zero
     while (number != 0) {
         total += number;
         System.out.print("Enter a number: ");
         number = scr.nextDouble();
     }

     System.out.println("The total sum is: " + total);
     scr.close();
 }
}
