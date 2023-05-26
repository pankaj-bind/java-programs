import java.util.*;

public class function3 {
    public static int factorial(int n){
        int fact = 1;
        for(int  i =n ; i>=1 ; i--){
            fact*=i;
        }

        return fact;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int n = sc.nextInt();
        System.out.println("factorial of " + n + " is " + factorial(n));
    }
}
