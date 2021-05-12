public class LineSegment {
    private Point2D startPoint;
    private Point2D endPoint;

    public LineSegment(){
        this.startPoint = new Point2D(0,0);
        this.endPoint = new Point2D(0,0);
    }
    public LineSegment(Point2D nStart, Point2D nEnd){
        if(nStart == null || nEnd == null){
            System.out.println("cannot be null");
            System.exit(0);
        }
        else{
            this.startPoint = nStart;
            this.endPoint = nEnd;
        }

    }

    public void setStartPoint(Point2D startPoint) {
        this.startPoint = startPoint;
    }
    public void setEndPoint(Point2D endPoint) {
        this.endPoint = endPoint;
    }
    public String getStartPoint(){
        return this.startPoint.toString();
    }
    public String getEndpoint(){
        return this.endPoint.toString();
    }

    public LineSegment(LineSegment other){
        this.setStartPoint(other.startPoint);
        this.setEndPoint(other.endPoint);
    }
    public double distance(){

        return Math.sqrt(
                ((this.endPoint.getY() - this.startPoint.getY())*
                        (this.endPoint.getY() - this.startPoint.getY()))+
                        ((this.endPoint.getX() - this.startPoint.getX())*
                                (this.endPoint.getX() - this.startPoint.getX()))
        );
    }
    @Override
    public String toString(){
        return "Line start ("+this.getStartPoint() + ") and end ("+this.getEndpoint()+")";
    }

    public boolean equals(Object obj){
        if(obj == null || this.getClass() != obj.getClass() ){
            return false;
        }
        if( this.startPoint.equals( ((LineSegment)obj).startPoint  ) &&
                this.endPoint.equals( ((LineSegment)obj).endPoint  )){
            return true;
        }
        else{
            return false;
        }
    }
}
