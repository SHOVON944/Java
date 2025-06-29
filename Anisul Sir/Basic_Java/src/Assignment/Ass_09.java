package Assignment;
import java.util.Scanner;

public class Ass_09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number(1-3): ");
        int num = scan.nextInt();
        
        switch(num){
            case 1:
                System.out.println("Selected language is Bengali.");
                break;
            case 2:
                System.out.println("Selected language is Hindi.");
                break;
            case 3:
                System.out.println("Selected language is Urdu.");
                break;
            default:
                System.out.println("Selected language is English.");
        }
    }
}
