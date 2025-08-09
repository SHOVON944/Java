package Start_Code;
import java.util.Scanner;
public class Farenheight_to_Celcius {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Farenhieght value: ");
        float F = scan.nextInt();
        float C =(5/9)*(F-32);
        System.out.println("Celcius is: " + C);

        scan.close();
    }
}
