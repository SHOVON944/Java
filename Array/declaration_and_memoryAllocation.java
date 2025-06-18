public class declaration_and_memoryAllocation {
    public static void main(String[] args) {

        int []arr;                  // Declaration
        arr = new int[3];           // Memory Allocation
        arr[0] = 93;
        arr[1] = 63;
        arr[2] = 56;
        System.out.println(arr[0]);

        int []marks = new int[5];   // Declaration + Memory Allocation
        marks[0] = 96;
        marks[1] = 66;
        marks[2] = 59;
        marks[3] = 73;
        marks[4] = 86;
        // marks[5] = 58; // give throws error.
        System.out.println(marks[0]);

        float []arry = {97.5f, 66, 55, 67};  //Declaration + Initialization
        System.out.println(arry[0]);
    }
}
