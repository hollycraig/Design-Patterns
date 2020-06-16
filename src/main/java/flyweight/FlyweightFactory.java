package flyweight;

import java.util.Map;
import java.util.TreeMap;

public class FlyweightFactory {
    private static Map<Integer, FlyweightImage> images = new TreeMap<>();

    public GUIElement makeGUIElement(int type){
        if (!images.containsKey(type)){
            images.put(type, new LargeImage("Large image data: " + type));
        }

        return new GUIElement(images.get(type));
    }
}
