package Level1;
import java.util.Scanner;

public class Ques9 {
	public static void main(String[] args) {
		
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter countdown start number: ");
        int start = scr.nextInt();

        System.out.println("Rocket Launch Countdown:");
        // Loop until the counter reaches 0
        for (int counter = start; counter >= 1; counter--) {
            System.out.println(counter);
        }
        scr.close();

	}

}
