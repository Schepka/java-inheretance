package session3;

public class RoboVehicle {
    private int numberOfWheels;
    private String make;
    private String model;
    private long unitNumber;
    private final String madeIn = "124 Robo Drive, McLean,Va 22102,USA";
    private final String madeBy = "TechCenture Aito Industries Inc";
    private final String vin;
    private String fuelType;

    public RoboVehicle(int numberOfWheels, String make, String model, String fuelType) {
        this.numberOfWheels = numberOfWheels;
        this.make = make;
        this.model = model;
        this.unitNumber = generateUnitNumber();
        this.vin = generateVin;
        this.fuelType = fuelType;
    }

    public void startEngine() {

        System.out.println("RoboVehicle started engine....");
    }

    public void drive(int speed) {
        if (speed > 0) {
            System.out.println("RoboVehicle is driving at" + speed + "miles per hour");
        } else {
            System.out.println("Speed cannot be negative");
        }
    }

    public void accelerate(int speed) {
        if (speed > 0) {
            System.out.println("RoboVehicle is accelerating");
        }
    }

    public void stop() {
        System.out.println(getClass().getName() + "has to complete stop");
    }

    public void fly(double height) {
        System.out.println(getClass().getName() + "is flying");
    }
    public String printVehicleDetails(){
        return  "ROBOVEHICLE DETAILS:\n" ;
        "NUMBER OF WHEELS:       " + numberOfWheels();






}
