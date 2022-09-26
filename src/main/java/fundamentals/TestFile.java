package fundamentals;

import java.util.Scanner;

public class TestFile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insert first number:");
        int a = input.nextInt();
        System.out.println("Insert second number:");
        int b = input.nextInt();

        if (a==b){
            do {
                System.out.println("Numbers cannot be equal!");
                System.out.println("Insert first number:");
                a = input.nextInt();
                System.out.println("Insert second number:");
                b = input.nextInt();
            } while(a==b) ;
        } else {
            if (a > b){
                System.out.println("Bigger number is: " + a);
            } else if (b > a) {
                System.out.println("Bigger number is: " + b);
            }
        }
    }
}
