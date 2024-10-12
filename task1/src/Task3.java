import java.util.Arrays;
import java.util.Random;

public class Task3 {

    private static final int N = 5;

    public static void main(String[] args) {

        int arraySize = 15;

        int[] array = new int[arraySize];
        Random random = new Random();

        System.out.println("Array:");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }

        Arrays.sort(array);

        System.out.println("\nN max numbers (N = " + N + "):");
        for (int i = array.length - 1; i >= array.length - N; i--) {
            System.out.print(array[i] + " ");
        }
    }

}
