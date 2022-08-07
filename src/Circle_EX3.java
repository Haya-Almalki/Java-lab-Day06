public class Circle_EX3 implements GeometricObject_EX3 {

    protected double radius;

    public Circle_EX3(double raduis) {
        this.radius = raduis;
    }

    @Override
    public String toString() {
        return "Circle_EX3{" +
                "raduis=" + radius +
                '}';
    }
    public double getPerimeter(){
        double perimeter = 2 * Math.PI * this.radius;
        return perimeter;
    }
    public double getArea(){
        double area=Math.PI * radius * radius;
        return area;
    }

}
