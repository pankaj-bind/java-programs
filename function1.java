import java.util.Scanner;

public class function1 {
    public static void call(int n){
        for(int j = 0; j<n; j++){
            System.out.println("hello world");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("how many times do you wanna print : ");
        int n = sc.nextInt();
        call(n);
    }
}
