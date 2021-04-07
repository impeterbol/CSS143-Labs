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
    public Car(int newOdom, int newSpeedom, String newMake, String newModel){
        this.odometer = newOdom;
        this.speedometer = newSpeedom;
        this.make = newMake;
        this.model = newModel;
    }
    public Car(String newMake){
        this.odometer = 0;
        this.speedometer = 0;
        this.make = newMake;
        this.model = "CR-v";
    }
    public Car(String newMake, String newModel){
        this.odometer = 0;
        this.speedometer = 0;
        this.make = newMake;
        this.model = newModel;
    }


    public String toStringPrint(){
       return this.odometer+ " "+this.speedometer+" "+this.make+" "+ this.model;
    }


    public static void main(String [] args){
        Car c1 = new Car();
        Car c2 = new Car (1200, 300, "BMW", "M3");
        Car c3 = new Car("SOMEMAKE");
        Car c4 = new Car("SOMEMAKE","SOMEMODEL");


        //this is a method to print content of object
        System.out.println(c1.toStringPrint());
        //this is object address
        System.out.println(c2.toString());
        System.out.println(c3.toStringPrint());
        System.out.println(c4.toStringPrint());

    }


    
}
