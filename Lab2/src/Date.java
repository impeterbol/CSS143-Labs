
//Date class means having an object created that contains required variables usign the constructor (a method)
//Date 'can do' actions defined by methods within the date class - i.e. setting date / updating date


public class Date {
    //instance variables
    private int day;
    private int month;
    private int year;

    public Date (int month, int day, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void setDate(int m, int d, int y) {
        this.day = d;
        this.month = m;
        this.year = y;

    }

    public void report(){
        System.out.println("\""+this.month+"/"+this.day+"/"+this.year+"\"" );
    }

    public static void main(String[] args){
        Date testDate = new Date(1,2,3000);
        testDate.report();
        testDate.setDate(04,14,1993);
        testDate.report();
    }
}


