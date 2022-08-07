public class Cylinder_EX1 extends Circle_EX1 {

    private double height=1.0;

    public Cylinder_EX1() {
    }

    public Cylinder_EX1(double radius) {
        super(radius);
    }

    public Cylinder_EX1(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder_EX1(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        double volume= Math.PI * getRadius() * getRadius() * height;
        return volume;
    }

}
