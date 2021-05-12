public class Date {

        private int month;
        private int day;
        private int year;

      public Date(){
          this.month = 01;
          this.day = 01;
          this.year = 1900;
      }
    public Date(int m, int d, int y){
        if((m>=1 && m<=12) && (d>=1 && d<=31) && (y>=0) ){
            this.month = m;
            this.day = d;
            this.year = y;
        }
        else{
            System.out.println("Please adjust month/day/year");
            System.exit(0);
        }
    }
    public Date(Date otherDate){
        this.setDate(otherDate.month,otherDate.day,otherDate.year);
    }

        public void setDate(int m, int d, int y){
            if((m>=1 && m<=12) && (d>=1 && d<=31) && (y>=1900) ){
                this.month = m;
                this.day = d;
                this.year = y;
            }
            else{
                System.out.println("Please adjust month/day/year");
                System.exit(0);
            }

        }

    //prints out date
    public void report(){
        System.out.printf("%d/%d/%d",this.month, this.day, this.year);
    }

    @Override
    public String toString(){
         return this.month+" / "+this.day+" / "+this.year;
    }

    public boolean equals(Object obj){
          if(obj.getClass()!=this.getClass() || obj==null){
              return false;
          }
          if(this.month == ((Date)obj).month &&
                  this.day == ((Date)obj).day &&
                  this.year == ((Date)obj).year){
              return true;
          }
          else{
              return false;
          }
    }


    public static void main(String[] args){
        Date d = new Date();
        d.setDate(10,21,2020);
        d.report();
        Date c = new Date(d);
        System.out.println();
        c.report();

        System.out.println(c.equals(d));
    }
}
