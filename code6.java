import java.util.Scanner;

public class code6 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i = 1;
        do{
            System.out.print("Enter a number : ");
            int n = sc.nextInt();
            if(n%2==0){
                System.out.println("thank you");
                break;
            }
        }while(true);
    }
}
