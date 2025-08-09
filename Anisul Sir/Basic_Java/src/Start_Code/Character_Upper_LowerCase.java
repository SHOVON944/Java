package Start_Code;
import java.util.Scanner;

public class Character_Upper_LowerCase {
    public static void main(String[] agrs){
        Scanner scan = new Scanner(System.in);
        System.out.print("Input Character: ");
        char ch = scan.next().charAt(0);
        Boolean check = Character.isUpperCase(ch);
        if(check) System.out.println("Uppercase Character.");
        else System.out.println("Lowercase Character");

        scan.close();
    }  
}
