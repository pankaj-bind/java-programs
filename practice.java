import java.util.Scanner;

public class practice{
    public static int function3(int c){
        int d = c;
        return d;
    }
    public static int function2(int b){
        int c = function3(b);
        return c;
    }
    public static int function1(int a){
        int b = function2(a);
        return b;
    }
    public static void main(String args[]){
       
        int a = 5;
        System.out.println(function1(a));
    }
}