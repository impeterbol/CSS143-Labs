public class Time {
    private int min;
    private int sec;
    private int hr;

    public Time(){
        this.min = 0;
        this.sec=0;
        this.hr=0;
    }

    public void setMin(int newMin){
        this.min = newMin;
    }
    public int getMin(){
        return this.min;
    }
}
