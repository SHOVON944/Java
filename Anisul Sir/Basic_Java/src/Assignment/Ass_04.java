import java.util.Scanner;
public class Ass_04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int phonePrice, number_of_installment, installment_per_month;

        System.out.println("Phone Price 1800 Euros");
        phonePrice = 1800 ;
        System.out.println("Enter your number of Installment, I'll show your per month installment amount = ");
        number_of_installment = input.nextInt();

        installment_per_month = phonePrice / number_of_installment;
        System.out.println("Your per month installment amount : "+installment_per_month+ "euros");


    }
}
