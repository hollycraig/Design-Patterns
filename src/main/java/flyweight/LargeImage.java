package flyweight;

public class LargeImage implements FlyweightImage{
    private final String imageData;

    public LargeImage(String imageData) {
        this.imageData = imageData;

        LargeImage.count++;
    }

    public void display() {
        System.out.println(imageData);
    }


    public static int count = 0;
}
