package level2;
import java.util.Scanner;

class Ques6 {
 public static void main(String[] args) {
     Scanner scr = new Scanner(System.in);

     System.out.print("Enter Amar's age: ");
     int amarAge = scr.nextInt();
     System.out.print("Enter Amar's height: ");
     double amarHeight = scr.nextDouble();

     System.out.print("Enter Akbar's age: ");
     int akbarAge = scr.nextInt();
     System.out.print("Enter Akbar's height: ");
     double akbarHeight = scr.nextDouble();

     System.out.print("Enter Anthony's age: ");
     int anthonyAge = scr.nextInt();
     System.out.print("Enter Anthony's height: ");
     double anthonyHeight = scr.nextDouble();

     //Finding the youngest friend
     if (amarAge <= akbarAge && amarAge <= anthonyAge) {
         System.out.println("The youngest friend is Amar.");
     } else if (akbarAge <= amarAge && akbarAge <= anthonyAge) {
         System.out.println("The youngest friend is Akbar.");
     } else {
         System.out.println("The youngest friend is Anthony.");
     }

     //Finding the tallest friend
     if (amarHeight >= akbarHeight && amarHeight >= anthonyHeight) {
         System.out.println("The tallest friend is Amar.");
     } else if (akbarHeight >= amarHeight && akbarHeight >= anthonyHeight) {
         System.out.println("The tallest friend is Akbar.");
     } else {
         System.out.println("The tallest friend is Anthony.");
     }
     scr.close();
 }
}
