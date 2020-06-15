public class Jet extends Vehicle {

    private int maximumAltitude;

    public Jet(boolean isOperable, int passengerCapacity, String powerSource, int maximumAltitude) {
        super(isOperable, passengerCapacity, powerSource);
        this.maximumAltitude = maximumAltitude;
    }

    public void takeOff() {
        System.out.println("Taking off...");
    }

    public int getMaximumAltitude() {
        return maximumAltitude;
    }

    public void setMaximumAltitude(int maximumAltitude) {
        this.maximumAltitude = maximumAltitude;
    }

    @Override
    public String toString() {
        return "Jet {" +
                "maximumAltitude: " + maximumAltitude + "\nisOperable: " + this.getOperable() + "\nPassenger Capacity: " + this.getPassengerCapacity() + "\nPower Source: " + this.getPowerSource() +
                '}';
    }
}
