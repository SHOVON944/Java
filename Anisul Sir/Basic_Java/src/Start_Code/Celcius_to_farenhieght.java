package Start_Code;
import java.util.Scanner;
public class Celcius_to_farenhieght {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Celcius value: ");
        float C = scan.nextInt();
        float F =((9/5)*C)+32;
        System.out.println("Farenhieght is: " + F);
        scan.close();
    }
}
