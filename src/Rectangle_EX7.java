public class Rectangle_EX7 extends Shape_EX7 {

    protected double width=1.0;
    protected double length=1.0;

    public Rectangle_EX7(){

    }
    public Rectangle_EX7(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle_EX7(double width, double length,String color, Boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        double area=getLength()*getWidth();
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter=(2*getLength())+(2*getWidth());
        return perimeter;
    }

    @Override
    public String toString() {
        return "Rectangle[Shape" +
                "[color='" + color + '\'' +
                ", filled=" + filled +
                "],width=" + width +
                ", length=" + length +"]";
    }
}
