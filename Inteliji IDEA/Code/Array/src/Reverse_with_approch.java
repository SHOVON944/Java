public class Reverse_with_approch {
    public static void main(String[] args) {
        int []arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int mid = Math.floorDiv(n, 2);
        for(int i=0; i<mid; i++){
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }

        for(int rev : arr){
            System.out.print(rev + " ");
        }
    }
}
