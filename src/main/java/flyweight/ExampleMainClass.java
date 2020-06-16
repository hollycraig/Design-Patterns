package flyweight;

import java.util.*;

public class ExampleMainClass {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        List<GUIElement> elements = new ArrayList<>();

        Random rand = new Random();

        for (int i = 0; i < 100; i++) {
            elements.add(factory.makeGUIElement(rand.nextInt(3)));
        }

        for (GUIElement element: elements) {
            element.display();
        }

        System.out.println("Total LargeImages created: " + LargeImage.count);
    }


}
