public class VehicleTest {

    public static void main(String[] args) {
        Car car1 = new Car(true, 4, "gas", 20);
//        car1.setOperable(true);
//        car1.setPassengerCapacity(4);
//        car1.setPowerSource("gas");

//        Car car2 = new Car();
//        car2.setOperable(false);
//        car2.setPassengerCapacity(2);
//        car2.setPowerSource("electric");

        Jet jet1 = new Jet(true, 2, "nuclear", 2000);
//        jet1.setOperable(false);
//        jet1.setPassengerCapacity(4);
//        jet1.setPowerSource("nuclear");

//        System.out.println(car1.getOperable());
//        System.out.println(car1.getPassengerCapacity());
//        System.out.println(car1.getPowerSource());
//
//        System.out.println(jet1.getOperable());
//        System.out.println(jet1.getPassengerCapacity());
//        System.out.println(jet1.getPowerSource());
//        System.out.println("===========");
//        System.out.println(jet1.toString());
//        System.out.println("===========");
//        car1.deployAirBag();
//        System.out.println("===========");
//        jet1.takeOff();
//        car1.setPassengerCapacity(5);
//        System.out.println("===========");
//        System.out.println(car1.toString());

        Vehicle[] vehicleArray = new Vehicle[2];
        vehicleArray[0] = car1;
        vehicleArray[1] = jet1;

        turnOnVehicles(vehicleArray);
    }
    public static void turnOnVehicles(Vehicle[] vehicle) {
        for (Vehicle v: vehicle) {
            v.turnOn();
        }
    }
}
