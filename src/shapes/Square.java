package shapes;

public class Square extends Quadrilateral {

    public Square(double side) {
        super(side, side);
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return this.length * 4;
    }

    @Override
    public double getArea() {
        return this.length * this.length;
    }

    //    public Square(int side) {
//        super(side, side);
//    }
//
//    public int getArea() {
//        return this.width * this.length;
//    }
//
//    public int getPerimeter() {
//       return 4 * this.width;
//    }
}
