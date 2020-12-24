package main.ua.mainacademy;

import main.ua.mainacademy.model.Circle;
import main.ua.mainacademy.model.Shape;
import main.ua.mainacademy.model.Square;
import main.ua.mainacademy.model.Triangle;
import main.ua.mainacademy.service.ShapeAreaService;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class Application {

    private static Logger LOGGER = Logger.getLogger(Application.class.getName());

    public static void main(String[] args) {

        Shape newtCircle = new Circle(15.0);
        Shape newSquare = new Square(10.0);
        Shape newTriangle = new Triangle(11.0, 12.0);
        List<Shape> shapes = Arrays.asList(newtCircle, newSquare, newTriangle);

        for (Shape s : shapes) {
            LOGGER.info(String.format("Initiated getting area method for %s class with result = %s",
                    s.getClass().getSimpleName(), ShapeAreaService.getArea(s)));
        }
    }
}
