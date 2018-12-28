package Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observerList = new ArrayList<>();

    public void update(String msg){
        this.notifyAll(msg);
    }
    //订阅
    public void addAttach(Observer observer){
        observerList.add(observer);
    }
    //通知所有订阅的观察者
    public void notifyAll(String msg){
        for (Observer observer : observerList) {
            observer.update(msg);
        }
    }
}
