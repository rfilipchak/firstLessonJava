package main.ua.mainacademy.model;

public class Triangle implements Shape {

    private final double sideA;
    private final double sideB;
    private final double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double getArea() {
        double halfPerimeter = getHalfPerimeter(sideA, sideB, sideC);
        return Math.sqrt(halfPerimeter * (halfPerimeter - sideA) * (halfPerimeter - sideB) * (halfPerimeter - sideC));
    }

    private double getHalfPerimeter(double sideA, double sideB, double sideC) {
        return (sideA + sideB + sideC) / 2;
    }
}
