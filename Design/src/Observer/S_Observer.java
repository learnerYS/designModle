package Observer;

/**
 * 第二个观察者
 */
public class S_Observer extends Observer{
    @Override
    public void update(String msg) {
        System.out.println(S_Observer.class.getName()+":"+msg);
    }
}
