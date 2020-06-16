package shapes;

public class Circle {
    private int radius;
//    public final double PI = 3.14159;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * (this.radius * this.radius);
    }

    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        System.out.println(c1.getArea());
        System.out.println(c1.getCircumference());
    }
}
