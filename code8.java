import java.util.*;
public class code8 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        do{
            int n = sc.nextInt();
            if(n%10==0){
                continue;
            }
            else{
                System.out.println(n);
            }
        }while(true);
    }
}
