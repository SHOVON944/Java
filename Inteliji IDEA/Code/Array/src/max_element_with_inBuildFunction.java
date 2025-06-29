import java.util.Arrays;
import java.util.Collections;

public class max_element_with_inBuildFunction {
    public static void main(String[] args) {
        Integer []arr = {1, 2, 3, 10, 5};
        int maximum = Collections.max(Arrays.asList(arr));
        System.out.println(maximum);
    }
}
