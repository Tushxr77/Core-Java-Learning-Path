import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of v: ");
        float v = sc.nextFloat();

        System.out.print("Enter value of u: ");
        float u = sc.nextFloat();

        System.out.print("Enter value of a: ");
        float a = sc.nextFloat();

        System.out.print("Enter value of s (distance): ");
        float s = sc.nextFloat();

        // Applying formula: (v^2 - u^2) / (2as)
        float result = (v * v - u * u) / (2 * a * s);

        System.out.println("Result: " + result);

        sc.close();
    }
}
