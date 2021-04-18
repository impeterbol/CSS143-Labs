public class Square {

    private int x;
    private int y;

    private double sideLength;
    private String shape = "[]";

    public Square(){
        this.x=0;
        this.y=0;
        this.sideLength =0;
    }
    public Square(int nx, int ny){
        this.x=nx;
        this.y=ny;
        this.sideLength =0;
    }
    public Square(int nx, int ny, double newSideLength){
        this.x=nx;
        this.y=ny;
        this.sideLength = newSideLength;
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
    public double getSideLength(){
        return this.sideLength;
    }
    public double getArea(){
        return this.x*this.y;
    }

    public void setX(int nX){
        this.x = nX;
    }
    public void setY(int nY){
    this.y = nY;
    }
    public void setSideLength(int sl){
        this.sideLength = (double) sl;
    }
    @Override
    public String toString(){
        return "[]";
    }

    public boolean equals(Square that){
        if(that ==null){
            return false;
        }

        if(this.x == that.x && this.y==that.y && this.sideLength == that.sideLength){
            return true;
        }
        else{
            return false;
        }
    }


}
