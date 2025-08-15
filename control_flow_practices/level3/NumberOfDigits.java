package ControlFlowPractices.Level3;
import java.util.Scanner;
public class NumberOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int count = 0;
        int temp = Math.abs(number); // Handle negative numbers

        while (temp != 0) {
            temp /= 10;
            count++;
        }

        System.out.println("Number of digits: " + count);
        sc.close();
    }    
}
