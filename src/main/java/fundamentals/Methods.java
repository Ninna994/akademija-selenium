package fundamentals;


import java.util.Scanner;

public class Methods {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        greetMe("Nikolina");
        System.out.println("Insert number to check if odd or even:");
        int num = scanner.nextInt();
        findEvenOdd(num);
        int a = 10;
        int b = 20;
        int sum = add(a,b);
        System.out.println("Sum is: " + sum);

        // instance method
        Methods methods = new Methods();
        methods.printMe();

        // overloading
        System.out.println(addition(5,7));
        System.out.println(addition(5,7,10));
        System.out.println(addition(5,7,10,20));
    }

    public static void greetMe(String name){
        System.out.println("Hello " + name);
    }

    public static  void findEvenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println(num + "is even");
        } else {
            System.out.println(num + " is odd number");
        }
    }

    public static int add(int a, int b) {
        int sum;
        sum = a+b;
        return sum;
    }

    public void printMe() {
        System.out.println("I am instance method. You had to create instance of object to call me");
    }

    public static int addition(int a, int b) {
        int sum;
        sum = a+b;
        return sum;
    }

    public static int addition(int a, int b, int c) {
        int sum;
        sum = a+b+c;
        return sum;
    }
    public static int addition(int a, int b, int c, int d) {
        int sum;
        sum = a+b+c+d;
        return sum;
    }
}
