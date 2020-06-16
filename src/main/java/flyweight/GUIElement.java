package flyweight;

public class GUIElement {
    private FlyweightImage largeImage;

    public GUIElement(FlyweightImage image) {
        this.largeImage = image;
    }

    public void display() {
        System.out.println("GUI Element");
        largeImage.display();
    }
}
