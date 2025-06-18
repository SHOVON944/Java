import java.util.Scanner;

public class calculate_percentage_of_five_subject {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Sub1 Number: ");
        float sub1 = scan.nextFloat();
        System.out.print("Enter the Sub2 Number: ");
        float sub2 = scan.nextFloat();
        System.out.print("Enter the Sub3 Number: ");
        float sub3 = scan.nextFloat();
        System.out.print("Enter the Sub4 Number: ");
        float sub4 = scan.nextFloat();
        System.out.print("Enter the Sub5 Number: ");
        float sub5 = scan.nextFloat();

        float percentage = ((sub1+sub2+sub3+sub4+sub5)/500)*100;
        System.out.printf("The Percentage of 5 subjects is: %.2f", percentage);
    }
}
