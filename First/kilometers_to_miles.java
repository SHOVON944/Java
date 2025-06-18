import java.util.Scanner;

public class kilometers_to_miles {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the kilometers: ");
        double kilometers = scan.nextDouble();
        double miles = kilometers*0.621371;
        System.out.println("The miles is: " +miles);
    }
}
