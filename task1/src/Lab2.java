import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number");
        double a = scanner.nextInt();
        System.out.println("Enter second number");
        double b = scanner.nextInt();
        double max = Math.max(a, b);
        double min = Math.min(a, b);
        double d = (max - 2 * min) / (Math.sin(2) + (max / min));
        System.out.println("result:" + d);
    }

}
