package Level1;
import java.util.*;
public class Ques4 {
	public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scr.nextInt();

        if (number > 0) {
            // Calculate the sum using the formula: n * (n + 1) / 2
            int sum = number * (number + 1) / 2;
            // Print the sum
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            // Print if the number is not a natural number
            System.out.println("The number " + number + " is not a natural number");
        }
        scr.close();


    }
}
