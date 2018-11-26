package Prototype;

public class Circle extends Shape{
    @Override
    void draw() {
        System.out.println("circle");
    }

    public Circle() {
        type = "circle";
    }
}
