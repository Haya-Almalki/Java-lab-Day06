public class ResizableCircle_EX3 extends Circle_EX3 implements Resizeable_EX3 {


    public ResizableCircle_EX3(double raduis) {
        super(raduis);
    }

    @Override
    public String toString() {
        return "ResizableCircle_EX3{" +
                "radius=" + radius +
                '}';
    }
    public void resize(int percent){
        radius*=percent/100.0;
    }
}
