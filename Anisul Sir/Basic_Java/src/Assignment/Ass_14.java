package Start_Code;

import java.util.Scanner;

public class Ass_14 {

    public static boolean isPalindrome(int x){
        int store = x;
        int rev = 0;
        while(x>0){
            int mod = x%10;
            rev = rev*10 + mod;
            x /= 10;
        }
        return (store==rev);
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int m = scan.nextInt();
        System.out.print("Enter the second number: ");
        int n = scan.nextInt();
        int count = 0;
        if(m>n){
            System.out.println("Invalid range! Starting number should be less than or equal to ending number.");
            return;
        }
        System.out.println("Palindrome numbers between " + m + " and " + n + " are:");
        
        for(int i=m; i<=n; i++){
            if(isPalindrome(i)){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("\nTotal number of palindrome numbers: " + count);
    }
}
