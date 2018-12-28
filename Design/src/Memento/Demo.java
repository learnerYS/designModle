package Memento;

import java.util.List;

/**
 * 备忘录模式
 */
public class Demo {
    public static void main(String[] args) throws Exception {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("1");
        originator.setDate("1");
        originator.setState("2");
        originator.setDate("2");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("3");
        originator.setDate("3");
        careTaker.add(originator.saveStateToMemento());
        originator.setDate("4");
        originator.setState("4");

        System.out.println("最近一次保存时间:"+originator.getDate()+"内容:"+originator.getState());


        List<Memento> list = careTaker.getList();
        for (Memento memento : list) {
            System.out.println("历史时间:"+memento.getDate()+"保存内容"+memento.getState());
        }

        //恢复2点时间
        Recover recover = new Recover();
        Originator recover1 = recover.recover("2", list, originator);
        System.out.println("恢复过后时间:"+recover1.getDate()+"内容"+recover1.getState());
    }
}
