public class Vehicle {
    private boolean isOperable;
    private int passengerCapacity;
    private String powerSource;

    public boolean getOperable() {
        return this.isOperable;
    }
    public void setOperable(boolean operable) {
        this.isOperable = operable;
    }

    public int getPassengerCapacity() {
        return this.passengerCapacity;
    }
    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public String getPowerSource() {
        return this.powerSource;
    }
    public void setPowerSource(String powerSource) {
        this.powerSource = powerSource;
    }

//    public Vehicle() {
//
//    }

    public Vehicle(boolean isOperable, int passengerCapacity, String powerSource) {
        this.isOperable = isOperable;
        this.passengerCapacity = passengerCapacity;
        this.powerSource = powerSource;
    }

    public void turnOn() {
        System.out.println("Cranking engine...");
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "isOperable=" + isOperable +
                ", passengerCapacity=" + passengerCapacity +
                ", powerSource='" + powerSource + '\'' +
                '}';
    }
}
