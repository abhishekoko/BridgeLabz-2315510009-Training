package Level1;

import java.util.Scanner;

public class Ques1 {
	public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scr.nextInt();
        
        //Check the number is divisible by 5 or not
        boolean isDiv = (n % 5 == 0);
        
        //Prints the results in Boolean Value
        System.out.println("Is the number " + n + " divisible by 5? " + isDiv);
        scr.close();

	}
}
