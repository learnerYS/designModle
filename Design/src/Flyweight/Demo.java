package Flyweight;

import java.util.Random;

/**
 * 享元模式
 */
public class Demo {
    private static final  String colors[]={"red","blue","green","yellow","gray"};

    public static void main(String[] args){
        for (int i=0;i<=20;i++){
            Random random = new Random();
            int i1 = random.nextInt(colors.length);
            Circle circle = (Circle) ShapeFactory.get(colors[i1]);
            circle.setRadius((int) Math.random());
            circle.setX(1);
            circle.setY(2);
            circle.draw();
        }
    }

}
