package level2;
import java.util.Scanner;

public class Ques2 {
 public static void main(String[] args) {
     Scanner scr = new Scanner(System.in);
     System.out.print("Enter your salary: ");
     double salary = scr.nextDouble();

     System.out.print("Enter your years of service: ");
     int yearsOfService = scr.nextInt();

     // Give a bonus of 5% to employees whose year of service is more than 5 years
     if (yearsOfService > 5) {
         double bonusAmount = salary * 0.05;
         
         System.out.println("Congratulations! Your bonus amount is: " + bonusAmount);
     } else {
         System.out.println("You are not eligible for a bonus this year.");
     }
     scr.close();

 }
}
