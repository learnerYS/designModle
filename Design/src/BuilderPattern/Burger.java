package BuilderPattern;

public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Warpper();
    }

    @Override
    public abstract float price();
}
