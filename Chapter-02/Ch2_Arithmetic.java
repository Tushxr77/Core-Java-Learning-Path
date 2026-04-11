public class Ch2_Arithmetic {
    public static void main(String[] args) {
        // 1. Modulo Operator (%) - Finding the remainder
        int a = 7;
        int b = 4;
        System.out.println("Remainder of 7 divided by 4 is: " + (a % b)); // Should be 3

        // 2. Assignment Operator (+=)
        int x = 10;
        x += 5; // This means x = x + 5
        System.out.println("Value of x after x += 5 is: " + x);

        // 3. Comparison Operator (==)
        System.out.println("Is 10 equal to 7? " + (10 == 7)); // Returns false

        // 4. Logical Operator (&&)
        // Checks if BOTH conditions are true
        System.out.println("Is 5 > 2 AND 10 < 100? " + (5 > 2 && 10 < 100));
    }
}
