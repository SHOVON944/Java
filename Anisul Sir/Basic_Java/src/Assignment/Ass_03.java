package Assignment;
import java.util.Scanner;
public class Ass_03 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your id: ");
        int id = scan.nextByte();
        scan.nextLine();
        System.out.print("Enter title: ");
        String title = scan.nextLine();
        System.out.print("Enter price: ");
        String price = scan.nextLine();
        System.out.print("Enter description: ");
        String description = scan.nextLine();
        System.out.print("Enter category: ");
        String category = scan.nextLine();
        
        System.out.println(id);
        System.out.println(title);
        System.out.println(price);
        System.out.println(description);
        System.out.println(category);
    }
}
