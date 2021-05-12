import java.awt.*;

public class Square extends Shape{

    private int x;
    private int y;

    private double sideLength;

    public Square(){
        super(0,0);
        this.sideLength =0;
    }
    public Square(int nx, int ny){
        super(nx,ny);
        this.sideLength =0;
    }
    public Square(int nx, int ny, double newSideLength){
        super(nx,ny);
        this.sideLength = newSideLength;
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
    public double getArea(){
        return this.x*this.y;
    }

    @Override
    public void draw( Graphics g ){
        g.drawRect(this.x,this.y,(int)this.sideLength,(int)this.sideLength);
    }




}
