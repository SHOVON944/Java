public class using_for_loop_to_print {
    public static void main(String[] args) {
        int []marks = new int[5];   // Declaration + Memory Allocation
        marks[0] = 96;
        marks[1] = 66;
        marks[2] = 59;
        marks[3] = 73;
        marks[4] = 86;

        for(int i : marks){
            System.out.println(marks[i]);
        }
    }
}
