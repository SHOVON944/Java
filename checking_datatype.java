import java.util.Scanner;

public class checking_datatype {
    public static void main(String[] args){
        System.out.println("Taking input (Entering except number get through Error[false]) : ");
        Scanner scan = new Scanner(System.in);
        boolean checker = scan.hasNextInt();
        System.out.println(checker);
        scan.close();
    }
}
