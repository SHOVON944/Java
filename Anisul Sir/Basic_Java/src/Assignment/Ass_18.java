package Assignment;

import java.util.Scanner;

public class Ass_18 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = scan.nextInt();
        String week[] = {"Monday", "Tuesday", "Wednesday", "Thusday", "Friday", "Saturday", "Sunday"};
        String ans = week[a-1];
        System.out.println("The day is: " + ans);
    }
}
