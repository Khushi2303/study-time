public class AreaCalculator {

    public static double calculateArea(double radius) {
        return Math.PI * radius * radius; // Area of a circle
    }

    public static double calculateArea(double length, double width) {
        return length * width; // Area of a rectangle
    }

    public static void main(String[] args) {
        double circleRadius = 5.0;
        double rectangleLength = 10.0;
        double rectangleWidth = 7.0;

        double circleArea = calculateArea(circleRadius);
        double rectangleArea = calculateArea(rectangleLength, rectangleWidth);

        System.out.println("Area of the circle: " + circleArea);
        System.out.println("Area of the rectangle: " + rectangleArea);
    }
}