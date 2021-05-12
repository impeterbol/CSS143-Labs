public class Math2 {
    public static final double PI = 3.14;
    public static final double E = 2.71;


    public static int max(int a, int b){
        if(a>b){
            return a;
        }
        else if(a==b){
            return 0;
        }
        else{
            return b;
        }
    }

    public static double max(double a, double b){
        if(a>b){
            return a;
        }
        else if(a==b){
            return 0;
        }
        else{
            return b;
        }
    }

    public static int pow (int base, int exp){
        return (int)Math.pow((double)base,(double)exp);
    }
}
