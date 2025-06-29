package Start_Code;

import java.util.Scanner;

public class Palindrome_or_not {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = scan.nextInt();
        int store = x;
        int rev = 0;
        while(x>0){
            int mod = x%10;
            rev = rev*10 + mod;
            x /= 10;
        }
        if(store==rev){
            System.out.println("This is a palindrome number.");
        }
        else{
            System.out.println("This is not a palindrome number.");
        }
    }
}
