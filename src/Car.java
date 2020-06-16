public class Car extends Vehicle {
    private int milesPerGallon;

    public Car(boolean isOperable, int passengerCapacity, String powerSource, int milesPerGallon) {
        super(isOperable, passengerCapacity, powerSource);
        this.milesPerGallon = milesPerGallon;
    }

    public int getMilesPerGallon() {
        return milesPerGallon;
    }

    public void setMilesPerGallon(int milesPerGallon) {
        this.milesPerGallon = milesPerGallon;
    }

    public void deployAirBag() {
        System.out.println("Deploying airbag...");
    }

    public void turnOn() {
        System.out.println("Cranking engine...");
    }

    @Override
    public String toString() {
        return "Car {" +
                "milesPerGallon: " + milesPerGallon + "\nisOperable: " + this.getOperable() + "\nPassenger Capacity: " + this.getPassengerCapacity() + "\nPower Source: " + this.getPowerSource() +
                '}';
    }
}
