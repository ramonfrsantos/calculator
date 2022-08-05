import java.util.ArrayList;
import java.util.List;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

public class Program {
    public static void main(String[] args) throws Exception {
        
        List<Shape> myShapes = new ArrayList<Shape>();
        myShapes.add(new Rectangle(3.0, 2.0));
        myShapes.add(new Circle(2.0));

        System.out.println("Total area: " + totalArea(myShapes));
    }

    public static double totalArea(List<Shape> list){
        double sum = 0.0;
        for (Shape shape : list){
            sum += shape.area();
        }

        return sum;
    }
}
