package MultidimensionalArraysExercises;

import java.util.Scanner;

public class D01FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputParts = input.split(", ");

        int size = Integer.parseInt(inputParts[0]);
        String type = inputParts[1];

        int[][] matrix = new int[size][size];

        switch (type) {
            case "A":
                fillPatternA(matrix, size);
                break;
            case "B":
                fillPatternB(matrix, size);
                break;
            default:
                System.out.println("Invalid pattern type");
                return;
        }

        printMatrix(matrix);
    }

    private static void fillPatternA(int[][] matrix, int size) {
        int num = 1;
        for (int col = 0; col < size; col++) {
            for (int row = 0; row < size; row++) {
                matrix[row][col] = num++;
            }
        }
    }

    private static void fillPatternB(int[][] matrix, int size) {
        int num = 1;
        for (int col = 0; col < size; col++) {
            if (col % 2 == 0) {
                for (int row = 0; row < size; row++) {
                    matrix[row][col] = num++;
                }
            } else {
                for (int row = size - 1; row >= 0; row--) {
                    matrix[row][col] = num++;
                }
            }
        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
