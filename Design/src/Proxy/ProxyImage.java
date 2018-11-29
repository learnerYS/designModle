package Proxy;

public class ProxyImage implements Image{
    private String filaName;
    private RealImage realImage;

    public ProxyImage(String filaName) {
        this.filaName = filaName;
    }

    @Override
    public void display() {
        realImage = new RealImage(filaName);
        realImage.display();
    }
}
