package Mediator;

/**
 * 中介者模式
 */
public class Demo {
    public static void main(String[] args){
        User ys = new User("ys");
        User zjx = new User("zjx");

        ys.send();
        zjx.send();
    }
}
