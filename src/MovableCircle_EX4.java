public class MovableCircle_EX4 implements Movable_EX4 {
    private int radius;
    private MovablePoint_EX4 center;

    public MovableCircle_EX4(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.radius = radius;
        this.center =new MovablePoint_EX4(x,y,xSpeed,ySpeed);
    }

    @Override
    public void moveUp() {
        center.y-=center.ySpeed;

    }

    @Override
    public void moveDown() {
        center.y+=center.ySpeed;
    }

    @Override
    public void moveLeft() {
        center.x-=center.xSpeed;
    }

    @Override
    public void moveRight() {
        center.x+=center.xSpeed;
    }

    @Override
    public String toString() {
        return "(" + center.x +
                "," + center.y +
                "), speed=(" + center.xSpeed +
                "," + center.ySpeed +
                "),radius=" + radius ;
    }
}
