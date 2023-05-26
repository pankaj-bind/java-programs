import java.util.Scanner;

public class code3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int i = 1;
        System.out.println("here you go");
        while(i<=n){
            System.out.println(i);
            i++;
        }
    }
}
