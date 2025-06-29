package lab_problem;
import java.util.Scanner;

public class Capital_Small_Letter {
    public static void main(String[] agrs){
        Scanner scan = new Scanner(System.in);
        System.out.print("Input Character: ");
        char ch = scan.next().charAt(0);
        
        if(ch>='a' && ch<='z') System.out.println("Small Letter");
        else if(ch>='A' && ch<='Z') System.out.println("Capital Letter");
        else System.out.println("Not a Letter");
    }  
}
