import java.util.Scanner;

public class If_Else_From_user {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       
        int Age = sc.nextInt();
        System.out.println(Age);

        if (Age>=18) {
            System.out.println("You Can Drive ");
        }
        else{
            System.out.println("You Can't drive Yet");
        }
    }
    
}
