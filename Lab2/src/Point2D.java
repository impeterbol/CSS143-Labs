public class Point2D {
    private int x;
    private int y;
    //private variables are not accessible outside of the class

    public void setX(int nX) {
        this.x = nX;
    }
    public void setY(int nY) {
        this.y = nY;
    }
    public int getX() {
    return this.x;
    }
    public int getY() {
        return this.y;
    }
    public void resetToOrigin() {
        this.x=0;
        this.y=0;
    }
    public void translate(int dx, int dy) {
        this.x+=dx;
        this.y+=dy;
    }
    @Override // noting that the standard method toString will be overridden.
    //We can also skip using it as it does not influence actual running of the method
    //Compared for example to @Test in tests where @Test defines an actual test start

    public String toString() {
        return this.x+" "+this.y;
    }
    public boolean equals(Point2D that) {
        if(this.x == that.x && this.y == that.y){
            return true;
        }
        else{
            return false;
        }
    }





    //driver below

    public static void main(String[] args) {
        Point2D a = new Point2D();
        a.setX(5);
        a.setY(2);
        System.out.println("Point at (" + a.getX() + ", " + a.getY() );
        a.translate(-1,-1);
        System.out.println("Point at (" + a.getX() + ", " + a.getY() );
        a.resetToOrigin();
        System.out.println("Point at (" + a.getX() + ", " + a.getY() );
        Point2D b = new Point2D();
        Point2D c = new Point2D();
        System.out.println(b.toString());
        System.out.println(c); //Question: why don’t I need c.toString() here?
        //because it's a default way of printing toString method in Java - you just pass the object and it executes toString
        System.out.println("Are b and c equal:" + b.equals(c));
    }
}
