package Level1;
import java.util.Scanner;
public class Ques8 {
	public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter countdown start number: ");
        int counter = scr.nextInt();

        System.out.println("Rocket Launch Countdown:");
        // Loop until the counter reaches 0
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
        scr.close();

	}
}
