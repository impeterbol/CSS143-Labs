public class PermanentHire extends SalariedWorker{
    private int perHr;

    private PermanentHire() {//private blocks this object from being created this way

    }
    //the only way to make a PermHire is with the constructor below
    public PermanentHire(String name, int social, int payPerMonth, int perHr){
        super(name, social, payPerMonth);
        this.perHr = perHr;
    }

    @Override
    public double calculateWeeklyPay(){
        return perHr*40;

    }

}
