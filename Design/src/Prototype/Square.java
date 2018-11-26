package Prototype;

public class Square extends Shape{
    @Override
    void draw() {
        System.out.println("Square");
    }

    public Square() {
        type="Square";
    }
}
