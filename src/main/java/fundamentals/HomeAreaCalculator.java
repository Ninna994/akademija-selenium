package fundamentals;

public class HomeAreaCalculator {
    public static void main(String[] args) {
        Rectangle room1 = new Rectangle();
        Rectangle room2 = new Rectangle(30,75);

        room1.setLength(50);
        room1.setWidth(25);

        double areaOfRoom = room1.calculateArea();
        double areaOfRoom2 = room2.calculateArea();

        double totalArea = areaOfRoom + areaOfRoom2;
        System.out.println("Total area of two rooms is: "+totalArea);

    }
}
