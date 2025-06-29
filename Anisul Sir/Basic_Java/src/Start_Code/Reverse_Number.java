package Start_Code;

import java.util.Scanner;

public class Reverse_Number {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = scan.nextInt();
        int rev = 0;
        while(x>0){
            int mod = x%10;
            rev = rev*10 + mod;
            x /= 10;
        }
        System.out.println("The reverse number is: " + rev);
    }
}
