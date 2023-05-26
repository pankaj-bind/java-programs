import java.util.Scanner;

public class areaofCircle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle : ");
        int radius = sc.nextInt();
        float area = 3.14f*radius*radius;
        System.out.println("area of circle is : "+area);
    }
}
