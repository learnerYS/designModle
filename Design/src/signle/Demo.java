package signle;

/**
 * 单例模式
 */
public class Demo {
    public static void main(String[] args){
        SingleObject instance = SingleObject.getInstance();
        instance.test();
    }
}
