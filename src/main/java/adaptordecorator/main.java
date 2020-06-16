package adaptordecorator;

import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args){

        List<Shape2> shapes = new ArrayList<>();

        Shape circle = new CircleObject();



        Shape2 circle2 = new CircleAdaptor();
        shapes.add(circle2);

        Shape2 square = new Square();
        shapes.add(square);

        Shape2 line = new Line();
        shapes.add(line);

        for (Shape2 shape: shapes){
            shape.display();
            ShapeDecorator decorator = new ShapeDecorator(shape);
            decorator.display();
        }




    }

}
