package Level1;
import java.util.Scanner;
public class Ques6 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scr.nextInt();

        // Check the sign of the number
        if (number > 0) {
            System.out.println("The number " + number + " is positive.");
        } else if (number < 0) {
            System.out.println("The number " + number + " is negative.");
        } else {
            System.out.println("The number " + number + " is zero.");
        }

        scr.close();

	}

}
