public class ColorWithAlpha extends SimpleColor{
    private int alpha;

    public ColorWithAlpha(int newAlpha){
        super(0,0,0);
        if(newAlpha<0 || newAlpha>255){
            throw new ColorException("out of the color range(colwalpha)");
        }

        this.alpha = newAlpha;

    }
    public ColorWithAlpha(int r, int g, int b, int a){
        super(r,g,b);
        if(a<0 || a>255){
            throw new ColorException("out of the color range(colwalpha)");
        }

        this.alpha = a;

    }

    public ColorWithAlpha(ColorWithAlpha obj){
       super(obj.getR(),obj.getG(),obj.getB());
       this.alpha = obj.alpha;

    }

    @Override
    public String toString(){
        return super.toString()+ ", alpha: "+ this.alpha;
    }

    @Override
    public boolean equals(Object o){
        if(this.getClass()!=o.getClass()){
            return false;
        }

        if(this.alpha == ((ColorWithAlpha)o).getAlpha() &&
                this.alpha == ((ColorWithAlpha)o).getR() &&
                this.alpha == ((ColorWithAlpha)o).getG() &&
                this.alpha == ((ColorWithAlpha)o).getB()   ){
            return true;
        }
        else{
            return false;
        }
    }

    public int getAlpha() {
        return this.alpha;
    }

    public void setAlpha(int alpha) {
        this.alpha = alpha;
    }
}
