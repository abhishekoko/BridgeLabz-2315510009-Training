package level2;

import java.util.Scanner;

public class Ques5 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scr.nextInt();

        if (number > 0) {
            int i = 1;

            while (i <= number) {
                // Check for multiples of 15 (both 3 and 5)
                if (i % 15 == 0) {
                    System.out.println("FizzBuzz");
                }
                // Check for multiples of 3
                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                }
                // Check for multiples of 5
                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                }
                // Otherwise, print the number
                else {
                    System.out.println(i);
                }
                i++;
            }
        } else {
            System.out.println("Please enter a positive integer.");
        }
        scr.close();
    }
}