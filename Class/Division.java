import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        double a = scan.nextDouble();
        System.out.print("Enter Second Number : ");
        double b = scan.nextDouble();
        if(a>b){
            System.out.print("The Sum is: " + (a/b));
        } else{
            System.out.println("1st Number is less then Second Number. Try Again!");
        }
        scan.close();
    }
}
