package Memento;

import java.util.List;

/**
 * 恢复
 */
public class Recover {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Recover() {
    }

    public Originator recover(String date, List<Memento> list,Originator originator) throws Exception {
        for (Memento memento : list) {
            if(memento.getDate().equals(date)){
                originator.setState(memento.getState());
                return originator;
            }
        }
        throw new Exception("改时间没有记录可以恢复");
    }
}
