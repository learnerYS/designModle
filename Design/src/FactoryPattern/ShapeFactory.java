package FactoryPattern;

public class ShapeFactory {

    public Shape getShape(String shapeType){
        if(shapeType ==null && shapeType.length()>0){
            return null;
        }
        switch (shapeType){
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
