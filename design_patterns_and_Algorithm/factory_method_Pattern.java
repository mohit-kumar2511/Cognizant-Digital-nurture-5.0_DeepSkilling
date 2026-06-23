interface Vehicle {
    void start();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car Started");
    }
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike Started");
    }
}

abstract class VehicleFactory {
    abstract Vehicle createVehicle();

    public void useVehicle() {
        Vehicle vehicle = createVehicle();
        vehicle.start();
    }
}

class CarFactory extends VehicleFactory {
    Vehicle createVehicle() {
        return new Car();
    }
}

class BikeFactory extends VehicleFactory {
    Vehicle createVehicle() {
        return new Bike();
    }
}

public class factory_method_Pattern {
    public static void main(String[] args) {

        VehicleFactory vf1 = new CarFactory();
        vf1.useVehicle();

        VehicleFactory vf2 = new BikeFactory();
        vf2.useVehicle();
    }
}