package Assignment;
import java.util.Scanner;

public class Ass_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Have you completed your masters? (y/n): ");
        String masters = scan.nextLine();

        System.out.print("Are you fluent in English? (y/n): ");
        String english = scan.nextLine();

        if (masters.equalsIgnoreCase("y") && english.equalsIgnoreCase("y")) {
            System.out.println("You are eligible for the job interview.");
        } else {
            System.out.println("Sorry, you are not eligible for the job interview.");
        }

        scan.close();
    }
}
