package MultidimensionalArraysLab;

import java.util.Scanner;

public class C01CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix1 = readMatrix(scanner);
        int[][] matrix2 = readMatrix(scanner);

        if (areMatricesEqual(matrix1, matrix2)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }

    private static int[][] readMatrix(Scanner scanner) {
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        return matrix;
    }

    private static boolean areMatricesEqual(int[][] matrix1, int[][] matrix2) {
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            return false;
        }

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                if (matrix1[i][j] != matrix2[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }
}
