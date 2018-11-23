package AbstractFactoryPattern;

import FactoryPattern.Circle;
import FactoryPattern.Rectangle;
import FactoryPattern.Shape;
import FactoryPattern.Square;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        if(shape ==null && shape.length()>0){
            return null;
        }
        switch (shape) {
            case "circle":
                return new Circle();
            case "rectangle":
                return new Rectangle();
            case "square":
                return new Square();
            default:
                return null;
        }
    }
}
