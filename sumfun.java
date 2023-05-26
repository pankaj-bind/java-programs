public class sumfun {
    public static int sumVal(int a, int b){
        return a+b;
    }
    public static float sumVal(float a, float b){
        return a+b;
    }

    public static void main(String args[]){
        System.out.println(sumVal(2,4));
        System.out.println(sumVal(2f,4f));
    }
}
