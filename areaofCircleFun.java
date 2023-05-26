import java.util.Scanner;

public class areaofCircleFun {
    public static float areaCircle(int a){
        float area = 3.14f*a*a;
        return area;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter radius of the circle : ");
        int r = sc.nextInt();
        float area = areaCircle(r);
        System.out.println("area of the circle is : "+area);
    }
}
