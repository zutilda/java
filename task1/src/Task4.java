import java.util.Random;

public class Task4 {
    public static void main(String[] args) {

        int row = 5;
        int column = 6;

        int[][] matrix = new int[row][column];
        Random random = new Random();

        System.out.println("Matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = random.nextInt(100);
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        int[] array = new int[column];
        for (int j = 0; j < column; j++) {
            int minIndex = 0;
            int min = matrix[0][j];
            for (int i = 0; i < row; i++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    minIndex = i;
                }

            }

            array[j] = min;
            System.out.print(array[j] + " ");
        }
    }
}
