import java.util.*;
public class Program03 {
    public static int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] transposeMatrix = new int[n][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transposeMatrix[j][i] = matrix[i][j];
            }
        }

        return transposeMatrix;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int[][] transposeMatrix = transpose(matrix);

        System.out.println("Transpose of matrix:");
        for (int[] row : transposeMatrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
