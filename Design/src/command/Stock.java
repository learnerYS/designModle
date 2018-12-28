package command;

public class Stock {
    private String name = "ABC";
    private int quantity = 10;
    public void buy(){
        System.out.println("buy:Name:"+name+"quantity:"+quantity);
    }
    public void sell(){
        System.out.println("sell:Name:"+name+"quantity:"+quantity);
    }
}
