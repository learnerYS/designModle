package Bridge;

public abstract class Shape {
    protected DrawAPI drawAPI;

    public void setDrawAPI(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
