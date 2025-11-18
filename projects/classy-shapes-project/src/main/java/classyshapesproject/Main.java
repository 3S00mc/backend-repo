package classyshapesproject;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10.0, 20.0);
        Circle circle = new Circle(10.0);

        double areaOfRectangle = ShapeMetricCalculator.calculateRectangleArea(rectangle);
        double areaOfCircle = ShapeMetricCalculator.calculateCircleArea(circle);

        System.out.println("\nArea of rectangle is " + areaOfRectangle + " and area of circle is " + areaOfCircle + ".");
    }
}
