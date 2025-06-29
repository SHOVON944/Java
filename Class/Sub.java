import java.util.Scanner;

public class Sub{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int a = scan.nextInt();
        System.out.print("Enter Second Number");
        int b = scan.nextInt();
        System.out.print("The Sum is: " + (a-b));
        scan.close();
    }
}