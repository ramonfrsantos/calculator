import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

public class Program {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        
        List<Shape> myShapes = new ArrayList<Shape>();
        myShapes.add(new Rectangle(3.0, 2.0));
        myShapes.add(new Circle(2.0));

        List<Circle> myCircles = new ArrayList<Circle>();
        myCircles.add(new Circle(2.0));
        myCircles.add(new Circle(3.0));

        System.out.printf("Total area: %.2f", totalArea(myCircles));
    }

    // a lista pode ser de Shape ou de qualquer tipo que seja subtipo de Shape (ex: Circle) 
    public static double totalArea(List<? extends Shape> list){
        double sum = 0.0;
        for (Shape shape : list){
            sum += shape.area();
        }

        return sum;
    }
}
