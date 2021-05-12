import java.awt.*;
public class Shape {
    private int x;
    private int y;
    private Color color;

    public Shape(){
        this.x = 0;
        this.y = 0;
        this.color = Color.BLUE;
    }
    public Shape(int nX, int nY,Color nColor){
        this.x = nX;
        this.y=nY;
        this.color = nColor;
    }
    public void setShape(int nX, int nY,Color nColor){
        this.x = nX;
        this.y=nY;
        this.color = nColor;
    }

    public Shape(Shape otherShape){
        this.setShape(otherShape.x,otherShape.y,otherShape.color);
    }
    public double getArea(){
        return -1;
    }
    public void drawGraphics(Graphics g){

    }

    public void setX(int nX){
        this.x = nX;
    }
    public void setY(int nY){
        this.y = nY;
    }

    @Override
    public String toString(){
        return "Shape ("+this.x +", "+this.y+
                ") and color : "+this.color+" and area " + this.getArea();
    }
}
