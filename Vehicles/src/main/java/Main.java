import Vehicles.LandVehicle.Moped;

public class Main {
    public static void main(String[] args) {
        Moped slowRide = new Moped();

        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);
        System.out.println(slowRide.getColor() + slowRide.getFuelCapacity());
    }
}
