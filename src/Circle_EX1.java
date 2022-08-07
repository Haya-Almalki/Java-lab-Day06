public class Circle_EX1 {

    private double radius=1.0;
    private String color="red";

    public Circle_EX1() {
    }

    public Circle_EX1(double radius) {
        this.radius = radius;
    }

    public Circle_EX1(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        double area=Math.PI * radius * radius;
        return area;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
