public class Square_EX7 extends Rectangle_EX7 {
    protected double side;
    public Square_EX7() {
    }
    public Square_EX7(double side) {
        this.side=side;
    }


    public Square_EX7(double side, String color, Boolean filled) {
        super(side, side, color, filled);
        this.side=side;
    }

    @Override
    public void setWidth(double side) {
        this.side=side;
    }

    @Override
    public void setLength(double side) {
        this.side=side;
    }

    @Override
    public String toString() {
        return  "Square[Rectangle[Shape" +
                "[color='" + color + '\'' +
                ", filled=" + filled +
                "],width=" + side +
                ", length=" + side +"]]";
    }
    }

