package classproject;
import java.util.Scanner;

public class Print_Name {

        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String s = scan.nextLine();
        System.out.println("Your Name is: " + s);
        scan.close();
        
    }
 
}
