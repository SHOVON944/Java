package Start_Code;
import java.util.Scanner;

public class pattarn_using_array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = 0;
        int arr[][] = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                arr[i][j] = k;
                k++;
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println("");
        }
    }
}
