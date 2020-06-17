package shapes;

abstract class Quadrilateral extends Shape implements Measurable {
    protected double length;
    protected double width;

    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    abstract void setLength(double length);

    public double getWidth() {
        return this.width;
    }

    abstract void setWidth(double width);
}
