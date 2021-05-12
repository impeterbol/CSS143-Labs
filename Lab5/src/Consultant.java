public class Consultant extends HourlyWorker{

    private int perHr;
   private int hrsWorked;

    private Consultant() {//private blocks this object from being created this way

    }
    //the only way to make a Consultant is with the constructor below
    public Consultant(String name, int social, int hrsWorked, int perHr){
        super(name, social);
        this.hrsWorked = hrsWorked;
        this.perHr = perHr;
    }

    @Override
    public double calculateWeeklyPay(){
        return this.hrsWorked*this.perHr;

    }


}
