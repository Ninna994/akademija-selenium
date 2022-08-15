package fundamentals;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo(); // if we want to call getRoom without making it static we instantiate class we are inside of
        Rectangle kitchen = calculator.getRoom();
        Rectangle bathroom = calculator.getRoom();

        calculator.scanner.close();
        double area = calculator.calculateTotalArea(kitchen, bathroom);
        System.out.println("Total area of rooms is: "+area);
    }

    public Rectangle getRoom(){
        System.out.println("Enter the length of your room:");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of your room:");
        double width = scanner.nextDouble();

        // instead of this we can write everything in return
        // Rectangle room = new Rectangle(length, width);
        return new Rectangle(length, width);
    }

    public double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2){
        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }
}
