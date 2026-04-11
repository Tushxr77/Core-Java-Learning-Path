import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int a = 10;

        // Checking if a is greater than input number
        boolean result = a > num;

        System.out.println("Is 10 greater than the entered number? " + result);

        sc.close(); 
    }
}
