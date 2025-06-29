import java.util.Scanner;

public class sum_two_number {
    static int call(int x, int y){
        return  x+y;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        int a = scan.nextInt();
        System.out.print("Enter the Second Number: ");
        int b = scan.nextInt();
        int c = call(a, b);
        System.out.println("The sum of two Number is: " + c);
    }
}
