public class Car {
    private int odometer;
    private int speedometer;
    private String make;
    private String model;

    public Car(){
        this.odometer = 0;
        this.speedometer = 0;
        this.make = "Honda";
        this.model = "CR-v";
    }

    public String toString(){
       return this.odometer+ " "+this.speedometer+" "+this.make+" "+ this.model;
    }


    public static void main(String [] args){
        Car c1 = new Car();
        System.out.println(c1.toString());
    }
    
}
