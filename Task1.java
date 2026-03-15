class Vehicle{
    protected String VehicleID;
    protected String brand;
    protected Double Speed;
    protected String FuelType;

    public Vehicle(String vehicleId,String Brand,Double speed,String fueltype){
        this.VehicleID = vehicleId;
        this.brand = Brand;
        this.Speed = speed;
        this.FuelType = fueltype;
    }

    public void start(){
        System.out.println("Vehicle started");
    }

    public void stop(){
        System.out.println("Vehicle stopped");
    }
    
    public void displayInfo(){
        System.out.println("Vehicle ID: "+this.VehicleID);
        System.out.println("Vehicle Brand: "+this.brand);
        System.out.println("Speed: "+this.Speed);
        System.out.println("Fuel Type: "+this.FuelType);
    }
}

class Car extends Vehicle{
    public Car(String vehicleId,String Brand,Double speed,String fueltype){
        super(vehicleId,Brand,speed,fueltype);
    }

    public void openSunroof() {
        System.out.println("Sunroof opened.");
    }

    public void activateCruiseControl() {
        System.out.println("Cruise control activated.");
    }
}

class Truck extends Vehicle{
    public Truck(String vehicleId,String Brand,Double speed,String fueltype){
        super(vehicleId,Brand,speed,fueltype);
    }

    public void loadCargo(Integer weight) {
        System.out.println("Cargo loaded: " + weight + " kg");
    }

    public void unloadCargo() {
        System.out.println("Cargo unloaded.");
    }
}

class Motorbike extends Vehicle{
    public Motorbike(String vehicleId,String Brand,Double speed,String fueltype){
        super(vehicleId,Brand,speed,fueltype);
    }
    public void popWheelie() {
        System.out.println("Popping a wheelie!");
    }

    public void enableABS() {
        System.out.println("ABS enabled.");
    }
}

class Bus extends Vehicle{
    public Bus(String vehicleId,String Brand,Double speed,String fueltype){
        super(vehicleId,Brand,speed,fueltype);
    }
    
    public void pickPassengers(Integer count) {
        System.out.println("Passengers picked: " + count);
    }

    public void dropPassengers() {
        System.out.println("Passengers dropped.");
    }
}

public class Task1 {
    public static void main(String[] args) {

        Car car = new Car("101", "Toyota", 120.0, "Petrol");
        System.out.println("Car");
        car.start();
        car.displayInfo();
        car.openSunroof();
        car.activateCruiseControl();
        car.stop();
        
        
        Truck truck = new Truck("102", "Volvo", 90.0, "Diesel");
        System.out.println("Truck Vehicle");
        truck.start();
        truck.displayInfo();
        truck.loadCargo(500);
        truck.unloadCargo();
        truck.stop();
        
        
        Motorbike bike = new Motorbike("103", "Yamaha", 140.0, "Petrol");
        System.out.println("Motorbike Vehicle");
        bike.start();
        bike.displayInfo();
        bike.popWheelie();
        bike.enableABS();
        bike.stop();
        
        Bus bus = new Bus("104", "Mercedes", 80.0, "Diesel");
        System.out.println("Bus Vehicle");
        bus.start();
        bus.displayInfo();
        bus.pickPassengers(40);
        bus.dropPassengers();
        bus.stop();
    }
}
