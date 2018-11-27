package Bridge;

/**
 * 桥接
 */
public class Demo {
    public static void main(String[] args){
        Circle red = new Circle(1, 1, 1, new RedCircle());
        Circle green = new Circle(2, 2, 2, new GreenCircle());

        red.draw();
        green.draw();
    }
}
