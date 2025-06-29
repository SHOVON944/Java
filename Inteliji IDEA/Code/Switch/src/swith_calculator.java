import java.util.Scanner;

public class swith_calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        char operator = scan.next().charAt(0);
        int num2 = scan.nextInt();

        switch(operator){
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                if(num2!=0){
                    System.out.println((float) num1/num2);
                } else{
                    System.out.println("Not divided");
                }
            default:
                System.out.println("The Entered operator is invalid.");
        }
    }
}


