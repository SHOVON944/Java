import java.util.Scanner;

public class Product{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1st number : ");
        int a = scan.nextInt();
        System.out.println("Enter Second Number");
        int b = scan.nextInt();
        System.out.println("The Product is: " + (a*b));
        scan.close();
    }
}