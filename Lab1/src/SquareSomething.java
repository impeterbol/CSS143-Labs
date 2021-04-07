public class SquareSomething {
    public static void main(String [] args){
        System.out.println(square(5));
        System.out.println(square(5.5));
        System.out.println(square(5.5f));
    }

    public static int square(int x){
        return x*x;
    }
    public static double square(double x){
        return x*x;
    }
    public static float square(float x){
        return x*x;
    }

}
