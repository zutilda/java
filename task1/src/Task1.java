import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number");
        int a = scanner.nextInt();
        System.out.println("Enter second number");
        int b = scanner.nextInt();

        if (a + b > 100) {
            double result = 2 * Math.sin(a);
            System.out.println(result);
        }

        else
            System.out.println("Enter another numbers");
    }

}
