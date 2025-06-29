package Assignment;

import java.util.Scanner;

public class Ass_13 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scan.nextInt();
        int fibo[] = new int[n];
        
        fibo[0] = 0;
        fibo[1] = 1;
        
        for(int i=2; i<n; i++){
            fibo[i] = fibo[i-1] + fibo[i-2];
        }
        for(int i:fibo){
            System.out.println(i + " ");
        }
        
    }
}
