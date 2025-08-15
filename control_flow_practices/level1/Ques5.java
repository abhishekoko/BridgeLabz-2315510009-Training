package Level1;

import java.util.Scanner;

public class Ques5 {
	public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int age = scr.nextInt();

        if (age >= 18) {
            // Print the output
            System.out.println("The person's age is "+ age + " and can vote.");
        } else {
            System.out.println("The person's age is "+ age + " and cannot vote.");
        }

        scr.close();

    }
}
