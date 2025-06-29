package Assignment;
import java.util.Scanner;

public class Ass_07 {
    public static void main(String[] agrs){
        Scanner scan = new Scanner(System.in);
        System.out.print("Input Character: ");
        char ch = scan.next().charAt(0);
        if(ch=='Y'  ||  ch=='y') System.out.println("You are a java lover.");
        else if(ch=='n'  ||   ch=='N') System.out.println("You are not a java lover.");
    }  
}
