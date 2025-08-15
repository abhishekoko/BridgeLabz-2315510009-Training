package level2;
import java.util.*;
public class Ques4 {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
		int number = scr.nextInt();
		
		if (number > 0) {

			for (int i = 1; i <= number; i++) {
                // For multiples of both 3 and 5, print "FizzBuzz" 
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                }
                // For multiples of 3, print "Fizz" 
                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                }
                // For multiples of 5, print "Buzz" 
                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                }
                // print the number
                else {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Please enter a positive integer.");
        }
		
		scr.close();
	}
}
