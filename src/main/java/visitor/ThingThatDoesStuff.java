package visitor;

import java.util.ArrayList;
import java.util.List;

public class ThingThatDoesStuff{
    private static List<Media> mediaList = new ArrayList<>();
    public static void main(String[] args){
        mediaList.add(new Book("name"));
        for (Media media: mediaList){
            System.out.println(media.getName());
            media.accept(new Visitor());
        }
    }
}