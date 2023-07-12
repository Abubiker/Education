package Lesson4;

public class HomeWork4_10 {
    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 2, 8, 3},
                {1, 1, 4, 6},
                {8, 3, 7, 2}
        };
        int[][] matrix2 = {
                {1, 2, 3},
                {4, 5, 1},
                {7, 4, 4},
                {2, 1, 3}
        };
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int cols2 = matrix2[0].length;

        if (cols1 != rows2) {
            System.out.println("Умножение матриц невозможно");
            return;
        }
        int[][] result = new int[rows1][cols2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        System.out.println("Результат умножения матриц:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
