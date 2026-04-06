import java.util.Scanner;

public class SumUser {
    public static void main(String[] args) {
        // Create scanner object
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number (can be decimal):");
        float num1 = sc.nextFloat(); // Using primitive 'float'

        System.out.println("Enter second number:");
        float num2 = sc.nextFloat();
        
        float sum = num1 + num2;

        System.out.println("The total sum is: " + sum);
        
        // Good habit: close the scanner
        sc.close();
    }
}
