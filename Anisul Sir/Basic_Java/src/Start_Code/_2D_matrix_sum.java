package Start_Code;
import java.util.Scanner;

public class _2D_matrix_sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the row number: ");
        int row = scan.nextInt();
        System.out.print("Enter the column number: ");
        int col = scan.nextInt();
        int A[][] = new int[row][col];
        int B[][] = new int[row][col];
        int sum[][] = new int[row][col];
        
        System.out.println("Enter the value of A: ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                A[i][j] = scan.nextInt();
            }
        }
        System.out.println("Enter the value of B: ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                B[i][j] = scan.nextInt();
            }
        }
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                sum[i][j] = A[i][j] + B[i][j];
            }
        }
        System.out.println("The sum is: ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(sum[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
