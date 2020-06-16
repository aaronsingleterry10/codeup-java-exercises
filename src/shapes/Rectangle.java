package shapes;

public class Rectangle {
    protected int width;
    protected int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int getArea() {
        return this.width * this.length;
    }

    public int getPerimeter() {
        return (this.width * 2) + (this.length * 2);
    }
}
