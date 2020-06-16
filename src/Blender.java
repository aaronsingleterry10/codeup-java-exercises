public class Blender extends Appliances {

    public void makeSound() {
        System.out.println("Making blender sounds...");
    }

    public void doWork() {
        System.out.println("Blending a smoothie...");
    }

    public static void main(String[] args) {
        Appliances b1 = new Blender();
        b1.doWork();
        b1.makeSound();
    }
}
