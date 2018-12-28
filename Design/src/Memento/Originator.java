package Memento;

public class Originator {
    private String state;
    private String date;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Memento saveStateToMemento(){
        return new Memento(state,date);
    }

    public void getStateFromMemento(Memento memento){
        state = memento.getState();
        date = memento.getDate();
    }
}
