package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
//    protected int width;
//    protected int length;
//
    public Rectangle(double length, double width) {
        super(length, width);
    }
//
//    public int getArea() {
//        return this.width * this.length;
//    }
//
//    public int getPerimeter() {
//        return (this.width * 2) + (this.length * 2);
//    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return this.length * 2 + this.width * 2;
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }
}
