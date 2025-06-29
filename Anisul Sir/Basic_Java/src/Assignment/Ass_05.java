package Assignment;
import java.util.Scanner;

public class Ass_05 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scan.nextByte();
        if(age>=18){
            System.out.println("Valid voter.");
        } else{
            System.out.println("Invalid voter.");
        }
    }
}
