package AbstractFactoryPattern;

import FactoryPattern.Circle;
import FactoryPattern.Rectangle;
import FactoryPattern.Shape;
import FactoryPattern.Square;

public class ColorFactory extends AbstractFactory{
    @Override
    public Color getColor(String color) {
        if(color ==null && color.length()>0){
            return null;
        }
        switch (color) {
            case "red":
                return new Red();
            case "green":
                return new Green();
            case "blue":
                return new Blue();
            default:
                return null;
        }
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
