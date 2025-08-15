package Level1;
import java.util.*;
public class Ques2 {
	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = scr.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = scr.nextInt();
        System.out.print("Enter the third number: ");
        int number3 = scr.nextInt();

        // Check if the first number is the smallest
        boolean isFirstSmallest = (number1 <= number2) && (number1 <= number3);

        // Print the result
        System.out.println("Is the first number the smallest? " + isFirstSmallest);
        scr.close();

	}
}
