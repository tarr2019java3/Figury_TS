package pl.sda.student;

public class Rectangle implements Figure {
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public Rectangle() {
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    @Override
    public double getPerimeter(double sideA, double sideB) {
        return sideA+sideA+sideB+sideB;
    }

    @Override
    public double getArea(double sideA, double sideB) {
        return sideA*sideB;
    }
}
