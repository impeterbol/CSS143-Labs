public class Circle {
    private int x;
    private int y;

    private double radius;
    private String shape = "O";

    public Circle(){
        this.x=0;
        this.y=0;
        this.radius =0;
    }
    public Circle(int nx, int ny){
        this.x=nx;
        this.y=ny;
        this.radius =0;
    }
    public Circle(int nx, int ny, double newRadius){
        this.x=nx;
        this.y=ny;
        this.radius = newRadius;
    }

    public void draw(){
        System.out.println(shape);
    }

    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public void setX(int nX){
        this.x = nX;
    }
    public void setY(int nY){
        this.y = nY;
    }

    public double getRadius(){

        return this.radius;
    }

    public void setRadius(int rad){

        this.radius = (double) rad;
    }

    public double getArea(){

        return 3.14*this.radius*this.radius;
    }

    @Override

    public String toString(){

        return "[]";
    }

    public boolean equals(Circle that){
        if(that ==null){
            return false;
        }

        if(this.x == that.x && this.y==that.y && this.radius == that.radius){
            return true;
        }
        else{
            return false;
        }
    }
}
