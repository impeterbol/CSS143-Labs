public class Fraction {

    public  final int NUMERATOR;
    public final int DENOMINATOR;

    public Fraction(int nNum, int nDen){
        this.NUMERATOR = nNum;
        this.DENOMINATOR = nDen;
    }
    public Fraction(Fraction other){
        this.NUMERATOR = other.NUMERATOR;
        this.DENOMINATOR = other.DENOMINATOR;
    }
    @Override
    public String toString(){
        return this.NUMERATOR+"\\"+this.DENOMINATOR;
    }
    public Fraction add(Fraction newFraction){
        int newNom;
        int newDen;
        if(this.DENOMINATOR == newFraction.DENOMINATOR){
            newNom = this.NUMERATOR+ newFraction.NUMERATOR;
            newDen = this.DENOMINATOR;
        }
        else if(this.DENOMINATOR> newFraction.DENOMINATOR){
            newNom = this.NUMERATOR+ newFraction.NUMERATOR*(this.DENOMINATOR/ newFraction.DENOMINATOR);
            newDen = newFraction.DENOMINATOR*(this.DENOMINATOR/ newFraction.DENOMINATOR);
        }
        else {
            newNom = (newFraction.DENOMINATOR/this.DENOMINATOR)*this.NUMERATOR+ newFraction.NUMERATOR;
            newDen = (newFraction.DENOMINATOR/this.DENOMINATOR)*this.DENOMINATOR;
        }


        Fraction res = new Fraction(newNom,newDen);
        return res;
    }
    public int getNum(){
        return this.NUMERATOR;
    }
    public int getDenom(){
        return this.DENOMINATOR;
    }


    public boolean equals(Object obj){
        if(this.getClass()!=obj.getClass() || obj==null){
            return false;
        }

        if(this.NUMERATOR == ((Fraction)obj).NUMERATOR &&
                this.DENOMINATOR == ((Fraction)obj).DENOMINATOR){
            return true;
        }
        else{
            return false;
        }
    }
}
