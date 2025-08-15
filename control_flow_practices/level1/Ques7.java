package Level1;
import java.util.Scanner;
public class Ques7 {

	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
        System.out.print("Enter Day: ");
        int day = scr.nextInt();
        
        System.out.print("Enter Month: ");
		int month = scr.nextInt();
        // Check for the Spring Season date range
        boolean isSpring = (month == 3 && day >= 20 && day <= 31) ||
                           (month == 4 && day >= 1 && day <= 30) ||
                           (month == 5 && day >= 1 && day <= 31) ||
                           (month == 6 && day >= 1 && day <= 20);

        // Print the result
        if (isSpring) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
        scr.close();

	}

}
