package fundamentals;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        /*
        * Write a method that asks user for his name and then greets them by that name
        * */
        System.out.println("Enter your name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        greetMe(name);

    }

    public static void greetMe(String name){
        System.out.println("Hello " + name);
    }
}
