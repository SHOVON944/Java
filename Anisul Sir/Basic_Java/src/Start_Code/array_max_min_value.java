package Start_Code;
import java.util.Arrays;

public class array_max_min_value {
    public static void main(String[] args) {
        int arr[] = {2, 3, 1, 5, 2, 6, 3, 6, 7, 4, 3};
        int max_elements = Arrays.stream(arr).max().getAsInt();
        int min_elements = Arrays.stream(arr).min().getAsInt();
        System.out.println("The maximum element is : " + max_elements);
        System.out.println("The minimum element is : " + min_elements);
    }
    
}
