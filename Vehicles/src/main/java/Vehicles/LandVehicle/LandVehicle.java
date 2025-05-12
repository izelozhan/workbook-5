package Vehicles.LandVehicle;

import Vehicles.Vehicle;

public class LandVehicle extends Vehicle {
    int wheels;


    public LandVehicle(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, int wheels) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.wheels = wheels;
    }

    public LandVehicle() {
        super();
    }
}
