package Bridge;

public class Circle extends Shape{
    private int x,y,radius;

    public Circle(int x, int y, int radius,DrawAPI drawAPI) {
        this.drawAPI=drawAPI;
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius,x,y);
    }
}
