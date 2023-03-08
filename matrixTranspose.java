public class matrixTranspose {
    public static void main(String args[]) {
        int matrix[][] = {{2, 4},
                {6, 4},
                {7, 5}};

        int rows = matrix.length;
        int cols = matrix[0].length;

        System.out.println(rows + " " + cols);
        System.out.println("The original matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("The transpose of the matrix: ");
        for (int j = 0; j < cols; j++){
            for (int i = 0; i < rows; i++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
      }
    }
