import java.util.Scanner;

public class input {
    public static void main(String[] abs){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = input.nextLine();
        System.out.println("SHRE, " +name+ ".");

        input.close();
    }
}
