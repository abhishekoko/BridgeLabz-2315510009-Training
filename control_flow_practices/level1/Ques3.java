package Level1;

import java.util.Scanner;

public class Ques3 {
	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = scr.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = scr.nextInt();
        System.out.print("Enter the third number: ");
        int number3 = scr.nextInt();

        // Check if the first number is the largest
        boolean isFirstLargest = (number1 >= number2) && (number1 >= number3);
        
        // Check if the second number is the largest
        boolean isSecondLargest = (number2 >= number1) && (number2 >= number3);
        
        // Check if the third number is the largest
        boolean isThirdLargest = (number3 >= number2) && (number3 >= number1);

        // Print the result
        System.out.println("Is the first number the largest? " + isFirstLargest);
        System.out.println("Is the Second number the largest? " + isSecondLargest);
        System.out.println("Is the Third number the largest? " + isThirdLargest);
        scr.close();

	}

}
