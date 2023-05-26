// how to check prime number
import java.util.*;
public class checkprime2{
    public static boolean check(int n){
        boolean check = true;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                check = false;
                break;
            }
        }
        return check;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int num = sc.nextInt();
        System.out.println("this number is prime : "+check(num));
    }
}