public class PointDriver {
    public static void main(String [] args){
        Point p1 = new Point();
        p1.publicAdd2();
        //Intellij says that privateMinus2 has private access
//        p1.privateMinus2();
    }
}
