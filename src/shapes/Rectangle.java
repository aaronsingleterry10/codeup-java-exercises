package shapes;

public class Rectangle {
    protected int width;
    protected int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int getArea(int width, int length) {
        return width * length;
    }

    public int getPerimeter(int width, int length) {
        return (width * 2) + (length * 2);
    }
}
