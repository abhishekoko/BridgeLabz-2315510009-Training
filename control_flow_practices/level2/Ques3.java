package level2;
import java.util.Scanner;

public class Ques3 {
 public static void main(String[] args) {
     Scanner scr = new Scanner(System.in);

     System.out.print("Enter a number for the multiplication table: ");
     int number = scr.nextInt();

     System.out.println("Multiplication table for " + number + " is :");

     // Using a for loop, find the multiplication table from 6 to 9
     for (int i = 6; i <= 9; i++) {
         System.out.println(number + " * " + i + " = " + (number * i));
     }
     scr.close();

 }
}
