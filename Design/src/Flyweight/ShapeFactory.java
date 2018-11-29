package Flyweight;

import java.util.HashMap;

public class ShapeFactory {
    private static final HashMap<String,Shape> map = new HashMap<>();

    public static Shape get(String color){
        Circle circle = (Circle) map.get(color);
        if(circle == null){
            circle = new Circle(color);
            map.put(color, circle);
        }
        return circle;
    }
}
