package Assignment;

import java.util.Scanner;

public class Ass_11 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = scan.nextInt();
        int factorial = 1;
        for(int i=1; i<=n; i++){
            factorial *= i;
        }
        System.out.println("The Factorial is: " + factorial);
    }
}
