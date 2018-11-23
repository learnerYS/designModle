package AbstractFactoryPattern;

import FactoryPattern.Shape;

public class Demo {
    public static void main(String[] args){
        FactoryProducer factoryProducer = new FactoryProducer();
        AbstractFactory color = factoryProducer.getFactory("color");
        Color red = color.getColor("red");
        red.fill();
        AbstractFactory shape = factoryProducer.getFactory("shape");
        Shape circle = shape.getShape("circle");
        circle.draw();
    }
}
