package fundamentals.practice;

import java.util.Scanner;

public class Practise1 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("******\nPractise task 1\n******");
        // calculationPrint();
        System.out.println("******\nPractise task 2\n******");
        // escapeSequences();
        System.out.println("******\nPractise task 3\n******");
        // mathTest();
        System.out.println("******\nPractise task 4\n******");
        //absoluteValue();
        System.out.println("******\nPractise task 5\n******");
        //  printOrderedNumbers();
        System.out.println("******\nPractise task 6\n******");
        //printBiggerNumberOfTwo();
        System.out.println("******\nPractise task 7\n******");
        //solveFunction();
        System.out.println("******\nPractise task 8\n******");
        //printBiggerNumberOfTwo2();
        System.out.println("******\nPractise task 9\n******");
        //printStarNumberOfTimes();
        System.out.println("******\nPractise task 9\n******");
        printMessageIfLength();
    }

    public static void calculationPrint() {
        System.out.println("          299");
        System.out.println("+         800");
        System.out.println("-------------");
        System.out.println("         " + (299 + 800));
    }

    public static void escapeSequences() {
        /*
            Make this table using System.out.println() and escape sequence
            Name    Height  Gender
            ----------------------
            Anna    5'4"    F
            Test    6'2"    M
            Ben     5'7"    M
         */
        System.out.println("Name\tHeight\tGender");
        System.out.println("---------------------");
        System.out.println("Anna\t5\'4\"\tF");
        System.out.println("Test\t6\'2\"\tM");
        System.out.println("Ben \t5\'7\"\tM");
    }

    public static void mathTest() {
        double a = 2.8, b = 3.1, c = 6.0;
        System.out.println("a+b \t\t= " + (a + b));
        System.out.println("|a| \t\t= " + Math.abs(a));
        System.out.println("round(a) \t= " + Math.round(a));
        System.out.println("ceil(a) \t= " + Math.ceil(a));
        System.out.println("floor(a) \t= " + Math.floor(a));
        System.out.println("exp(a) \t\t= " + Math.exp(a));
        System.out.println("max of a and b \t= " + Math.max(a, b));
        System.out.println("min of a and b \t= " + Math.min(a, b));
        System.out.println("2^c \t\t= " + Math.pow(2, c));
    }

    public static void absoluteValue() {
        /*
         * Write program that takes number from user.
         * After user inputs number absolute value of that number is printed
         * */

        System.out.println("Insert number to get absolute value");
        int userNumber = scanner.nextInt();
        if (userNumber < 0) {
            userNumber = -userNumber;
        }
        System.out.println("Absolute value of inserted number is " + userNumber);
    }

    public static void printOrderedNumbers() {
        /*
        Write program that takes two INT numbers from user
        and prints them in order: bigger, smaller
         */

        System.out.println("Insert two numbers(ints)");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        if (firstNumber > secondNumber) {
            int temp = firstNumber;
            firstNumber = secondNumber;
            secondNumber = temp;
        }
        System.out.println("Ordered numbers are: " + firstNumber + "," + secondNumber);
    }

    public static void printBiggerNumberOfTwo() {
        /*
        Write a program that takes two different int numbers from user and prints bigger one.
         */

        System.out.println("Insert two different numbers(ints)");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int bigger;

        if (firstNumber > secondNumber) {
            bigger = firstNumber;
        } else {
            bigger = secondNumber;
        }

        System.out.println("Bigger number is: " + bigger);
    }

    public static void solveFunction() {
        /*
        Take number from user and assign it as X
        calculate f(x) and g(x)
        f(x) = 2x (for 0<=x<=100)
             = 0  (othervise)
        g(x) = x^2 (for 0<=x<=100)
             = 0  (othervise)
         */
        System.out.println("Insert number(int)");
        int x = scanner.nextInt();
        int f;
        int g;

        if (x >= 0 && x <= 100) {
            f = 2 * x;
            g = x * x;
        } else {
            f = 0;
            g = 0;
        }

        System.out.println("f(x)=" + f);
        System.out.println("g(x)=" + g);
    }

    public static void printBiggerNumberOfTwo2() {
        /*
        Take two number from user. Print bigger one.
        In case user enters same two numbers print adequate message.
         */
        System.out.println("Insert two numbers(ints)");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int bigger;

        if (firstNumber > secondNumber) {
            System.out.println("Bigger number is " + firstNumber);
        } else if (firstNumber < secondNumber) {
            System.out.println("Bigger number is " + secondNumber);
        } else {
            System.out.println("Numbers are equal");
        }
    }

    public static void printStarNumberOfTimes() {
        /*
        Ask for number 1-6
        Print corresponding number of * characters
         */
        System.out.println("Insert number of stars you would like to get: ");
        int numberOfStars = scanner.nextInt();
        String stringToPrint;
        switch (numberOfStars) {
            case 1:
                stringToPrint = "*";
                break;
            case 2:
                stringToPrint = "**";
                break;
            case 3:
                stringToPrint = "***";
                break;
            case 4:
                stringToPrint = "****";
                break;
            case 5:
                stringToPrint = "*****";
                break;
            case 6:
                stringToPrint = "******";
                break;
            default:
                stringToPrint = "Please insert number between 1 and 6. Current number out of range. ";
        }
        System.out.println(stringToPrint);
    }

    public static void printMessageIfLength() {
        /*
        Write a java program that receives a text message from
        keyboard and print it out if its length is between 6-10
        characters.
         */
        System.out.println("Insert you message:");
        String message = scanner.next();
        if (message.length() >= 6 && message.length()<=10) {
            System.out.println("Your message is: "+message);
        } else {
            System.out.println("Message is either too long or too short.");
        }
    }


}
