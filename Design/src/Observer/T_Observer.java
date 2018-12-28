package Observer;

/**
 * 第三个观察者
 */
public class T_Observer extends Observer {
    @Override
    public void update(String msg) {
        System.out.println(T_Observer.class.getName()+":"+msg);
    }
}
