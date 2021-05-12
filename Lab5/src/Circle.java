import java.awt.*;

public class Circle extends Shape{
    private double radius;


    public Circle(){
        super(0,0);
        this.radius = 0;
    }

    public Circle(int nx, int ny, double newRadius){
        super(nx,ny);
        this.radius = newRadius;
    }

    public void setRadius(double newRad){
        this.radius = newRad;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea(){
        return 3.14*this.radius*this.radius; //add return area of shape
    }

    @Override
    public void draw(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawOval(this.getX(),this.getY(),this.getX(),this.getY());

    }

}
