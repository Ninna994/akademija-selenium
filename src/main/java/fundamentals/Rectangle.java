package fundamentals;

public class Rectangle {
    // write the class that describes the fields and methods of a rectangle
    // write another class that creates instances of the rectangle class to find the total area of two rooms in a house

    private double length;
    private double width;

    protected double sides = 4;

    public double calculatePerimeter() {
        return (2 * length) + (2 * width);
    }

    public double calculateArea() {
        return length * width;
    }

    // this class does not have main because we are not interested in executing methods inside of this class itself
    // if we want anyone to use this class and set length and width with generating getters and setters


    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    // constructor - same name as Class/Object
    //default constructor does not have a parameter list  - used to assign values to the fields

    public Rectangle() {
        length = 0;
        width = 0;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;

        //or
        // setWidth(width);
        // setLength(length);
    }

    public double getSides() {
        return sides;
    }

    public void setSides(double sides) {
        this.sides = sides;
    }
}
