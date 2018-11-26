package Prototype;

/**
 * 原型模式
 */
public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException {
        ShapeCache.loadCache();

        Shape shape = ShapeCache.getShape("1");
        System.out.println(shape.getType());
        Shape shape2 = ShapeCache.getShape("2");
        System.out.println(shape2.getType());
        Shape shape3 = ShapeCache.getShape("3");
        System.out.println(shape3.getType());
    }
}
