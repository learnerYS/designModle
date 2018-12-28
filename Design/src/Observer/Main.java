package Observer;

public class Main {
    public static void main(String[] args){
        //创建三个观察着
        F_Observer f_observer = new F_Observer();
        S_Observer s_observer = new S_Observer();
        T_Observer t_observer = new T_Observer();
        //一个被观察者
        Subject subject = new Subject();
        //订阅
        subject.addAttach(f_observer);
        subject.addAttach(s_observer);
        subject.addAttach(t_observer);
        //对被观察者更新
        subject.update("123");
    }

}
