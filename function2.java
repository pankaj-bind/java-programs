import java.util.*;
public class function2 {
    public static int sum(int n1, int n2){
        int total = n1+n2;
        return total;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number : ");
        int n1 = sc.nextInt();
        System.out.print("enter second number : ");
        int n2 = sc.nextInt();
        System.out.println("sum of "+n1+" and "+n2+" is "+sum(n1,n2));
    }
}
