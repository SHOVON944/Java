public class _2D_Array_Adding {
    public static void main(String[] args) {
        int [][]mat1 = {{2, 3, 4},
                        {5,4,3}};
        int [][]mat2 = {{4,5,2},
                        {3, 1, 6}};
    int [][]sum = {{0, 0, 0},
                    {0, 0, 0}};

        for(int i=0; i<mat1.length; i++){
            for(int j=0; j<mat1[i].length; j++){
                sum[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
