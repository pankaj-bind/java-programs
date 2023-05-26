import java.util.*;
public class code2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("******area of circle******");
        // System.out.println();
        System.out.print("Enter radius of the circle : ");
        float radius = sc.nextFloat();
        float area = 3.14f * radius* radius;
        System.out.println("area of the circle is : "+area);
    }
}
