package FactoryPattern;

public class Demo {
    public static void main(String[] args){
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape("circle");
        circle.draw();
        Shape circle1 = shapeFactory.getShape("square");
        circle1.draw();
        Shape circle3 = shapeFactory.getShape("rectangle");
        circle3.draw();
    }
}
