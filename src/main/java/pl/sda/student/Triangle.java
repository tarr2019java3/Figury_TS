package pl.sda.student;

public class Triangle implements Figure {
    private double sideA;
    private double sideB;

    public Triangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
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

    public Triangle() {
    }
    public double getPerimeter (double sideA, double sideB){
        return sideA+sideB+Math.sqrt((sideA*sideA)+(sideB*sideB));

    }
    public double getArea(double sideA, double sideB){
        return  sideA*sideB/2.0;

    }
}
