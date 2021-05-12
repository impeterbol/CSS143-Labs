/*
 *  
 * 
 */
public class Point2D
{
    private int x;
    private int y;
    
    public static void main(String[] args) { 
    
        Point2D a = new Point2D();   
        a.setX(5);   
        a.setY(2);   
        System.out.println("Point at (" + a.getX() + ", " + a.getY() + ")");   
        a.translate(-1,-1);   
        System.out.println("Point at (" + a.getX() + ", " + a.getY() + ")");   
        a.resetToOrigin();   
        System.out.println("Point at (" + a.getX() + ", " + a.getY() + ")");   
        Point2D b = new Point2D();   
        Point2D c = new Point2D();   
        System.out.println(b.toString());   
        System.out.println(c);  
      //Question: why don��t I need c.toString() here?   // it's built in
        System.out.println("Are b and c equal? :" + b.equals(c));  
    }
    
    //default constructor
    public Point2D() {
        this.x = 0;
        this.y = 0;

    }
    
    //overload constructor
    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    //copy constructor
    public Point2D(Point2D that) {
       this.x = that.x;
       this.y = that.y;
    }
    
    


    //This method should set your private variable x equal to nX. 
    public void setX(int nX) { 
        this.x = nX;
    }
    
    //Similar to above but for y 
    public void setY(int nY) { 
        this.y = nY;
    }
    
    //This function should return a copy of your private integer x; 
    public int getX() { 
        return this.x;
    }
    
    //Similar to above, but for y. 
    public int getY() { 
        return this.y;
    }
    
    //This function sets both x and y to zero. 
    public void resetToOrigin() {
        this.x = 0;
        this.y = 0;
    } 
    
    //This method adds dx to x, and dy to y 
    public void translate(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    } 
    
    @Override 
    //returns a string representation of the point 
    public String toString() { 
        return "(" + this.x + ", " + this.y + ")";
    }
    
    
    //returns true if this is equal to that; don��t just use ��this == that�� } 
    public boolean equals(Point2D that) {
        if(this.x == that.x && this.y == that.y){
            return  true;
        }
        else{
            return false;
        }
    }
}


