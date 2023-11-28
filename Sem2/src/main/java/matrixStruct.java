public class matrixStruct {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 5, 6},
                          {4, 1, 5, 7, 3},
                          {4, 4, 1, 4, 6},
                          {3, 4, 2, 4, 6},
                          {2, 4, 6, 2, 10}};

        System.out.println(matrSum(matrix));
    }

    public static int matrSum(int[][] matrix){
        int summ = 0;
        int len = matrix.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    summ += matrix[i][j];
                }
            }
        }
        return summ;
    }
}
