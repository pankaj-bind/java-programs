import java.util.Scanner;

public class code4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int sum = 0;
        int count=1;
        while(count<=n){
            sum+=count;
            count++;
        }
        System.out.println("sum is "+sum);
    }
}
