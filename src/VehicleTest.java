public class VehicleTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setOperable(true);
        car1.setPassengerCapacity(4);
        car1.setPowerSource("gas");

        Car car2 = new Car();
        car2.setOperable(false);
        car2.setPassengerCapacity(2);
        car2.setPowerSource("electric");

        Jet jet1 = new Jet();
        jet1.setOperable(false);
        jet1.setPassengerCapacity(4);
        jet1.setPowerSource("nuclear");

        System.out.println(car1.getOperable());
        System.out.println(car1.getPassengerCapacity());
        System.out.println(car1.getPowerSource());

        System.out.println(jet1.getOperable());
        System.out.println(jet1.getPassengerCapacity());
        System.out.println(jet1.getPowerSource());
    }
}
