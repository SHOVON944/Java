package Assignment;

import java.util.Scanner;

public class Ass_15{

    public static boolean isArmstrong(int a){
        int rev = a;
        int sum = 0;
        while(a>0){
            int mod = a%10;
            sum += Math.pow(mod, 3);
            a /= 10;
        }
        return (rev == sum);
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
        System.out.println("Armstrong numbers between " + m + " and " + n + " are:");
        
        for(int i=m; i<=n; i++){
            if(isArmstrong(i)){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("\nTotal number of Armstrong numbers: " + count);
    }
}
