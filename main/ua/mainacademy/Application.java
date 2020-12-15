package main.ua.mainacademy;

import main.ua.mainacademy.model.Circle;
import main.ua.mainacademy.model.Shape;
import main.ua.mainacademy.model.Square;
import main.ua.mainacademy.model.Triangle;

public class Application {
    public static void main(String[] args) {

        double firstRadius = 15.0;
        double squareSide = 10;
        double triangleSideA = 11;
        double triangleSideB = 12;
        double triangleSideC = 13;

        Shape newtCircle = new Circle(firstRadius);
        Shape newSquare = new Square(squareSide);
        Shape newTriangle = new Triangle(triangleSideA, triangleSideB, triangleSideC);

        System.out.println("Circle area with radius " + firstRadius + " is " + newtCircle.getArea());
        System.out.println("Square area with side " + squareSide + " is " + newSquare.getArea());
        System.out.println("Triangle area with sides " + triangleSideA + "/" + triangleSideB + "/" + triangleSideC +" is " + newTriangle.getArea());
    }
}
