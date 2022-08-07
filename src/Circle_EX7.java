public class Circle_EX7 extends Shape_EX7 {

    protected double radius=1.0;
    public Circle_EX7() {

    }
    public Circle_EX7(String color, Boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle_EX7(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override



    public double getArea() {
        double area=Math.PI * this.radius * this.radius;
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = 2 * Math.PI * this.radius;
        return perimeter;
    }

    @Override
    public String toString() {
        return "Circle[" +
                "Shape[color='" + color + '\'' +
                ", filled=" + filled +
                "], radius=" + radius +
                ']';
    }
}
