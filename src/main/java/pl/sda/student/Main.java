package pl.sda.student;

public class Main {

    public static void main(String[] args) {
	Triangle triangle = new Triangle(15.0,20.0);
	Rectangle rectangle = new Rectangle(20.0,74.0);
	System.out.println("Pole trojkata wynosi: "+triangle.getArea(triangle.getSideA(),triangle.getSideB()));
        System.out.println("Obwod trojkata wynosi: "+triangle.getPerimeter(triangle.getSideA(),triangle.getSideB()));
        System.out.println("Pole prostokata wynosi: "+rectangle.getArea(rectangle.getSideA(),rectangle.getSideB()));
        System.out.println("Obwod prostokata wynosi: "+rectangle.getPerimeter(rectangle.getSideA(),rectangle.getSideB()));


    }

}
