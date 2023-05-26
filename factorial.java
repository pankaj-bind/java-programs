import java.util.Scanner;
public class factorial {

    public static int fact(int a) {
        int f = 1;
        for(int i = 1; i<=a; i++){
            f = f * i;
        }
        return f;
    }
    public static int factor(int n, int r){
        int fact_n = fact(n);
        int fact_r = fact(r);
        int fact_nmr = fact(n-r);

        int factorialanswer = fact_n /(fact_r * fact_nmr);

        return factorialanswer;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        System.out.println(factor(n,r));
        
    }

}
