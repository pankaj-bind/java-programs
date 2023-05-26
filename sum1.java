// import java.util.*;
import java.util.Scanner;
public class sum1 {
    public static int calculateSum(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number : ");
        int num2 = sc.nextInt();
        int sum = calculateSum(num1,num2);
        System.out.println("Sum of "+num1+" and "+num2+" is "+sum);

    }
}
