package fundamentals_java.exam;

public class Rectangle {
    /*
    Write a java class called Rectangle. The Rectangle class will have three data
members: width (a double), length (a double) and area (a double).
Make Square class that inherits Rectangle object and calculates area of Square.
Make third class TestArea where you will make two objects, one Rectangle and one Circle and calculate total area
Write a java program to test your Rectangle class.
     */
    private double width;
    private double length;
    private double area;

    public Rectangle(double width, double length, double area) {
        this.width = width;
        this.length = length;
        this.area = area;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double calculateArea(double width, double length) {
        area = (2 * width) + (2 * length);
        return area;
    }
}
