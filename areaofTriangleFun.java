import java.util.Scanner;

public class areaofTriangleFun {
    public static float areaTriangle(int height, int base) {
        float area = 0.5f * height * base;
        return area;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height of the triangle : ");
        int height = sc.nextInt();
        System.out.print("Enter base of the triangle : ");
        int base = sc.nextInt();
        float area = areaTriangle(height, base);
        System.out.println("area of triangle is : " + area);
    }
}
