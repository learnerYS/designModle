package signle;

public class SingleObject {
    private SingleObject() {
    }

    public static SingleObject instance = new SingleObject();

    public static SingleObject getInstance(){
        return instance;
    }

    public void test(){
        System.out.println("hello");
    }
}
