import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the Kilo meters ");
        Float kilometers= sc.nextFloat();

        Float Miles= (kilometers*0.621371f);
        System.out.println("The Miles Is "+Miles);
    }
    
}

