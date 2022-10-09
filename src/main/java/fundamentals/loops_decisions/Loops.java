package fundamentals.loops_decisions;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        /*
        Each store employee makes 15dollars an hour.
        Write a program that allows a manager to enter the number of weekly hours worked for each employee and calculate their pay.
        Do not allow for overtime.
         */
        System.out.println("Excercise 1 - Gross calculator");
        //grossCalculator();

        /*
        Write a program that allows a user to enter two numbers and then sum it up
        The user should be able to repeat this action until they indicate they are done
         */

        System.out.println("Excercise  - Add numbers");
        //addNumbers();

        /*
        Write a cashioer program that will scan a given number of items and tally the cost
         */
        System.out.println("Excercise  - Cashier Program");
        //cashierProgram();

        /*
        Search a String to determine if it contains the letter 'A'
         */
        System.out.println("Excercise  - String Scan");
        //stringScan();

        /*
        Find the average test scores for each student in the class. There are 24 students and 4 tests
         */

        System.out.println("Excercise - Average test score");
        avgTestScore();
    }


    public static void grossCalculator(){
        int hourRate = 15;
        int maxHours = 40;

        System.out.println("How many hours did you work last week?");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        while(hoursWorked > maxHours){
            System.out.println("Invalid entry. Enter value between 1 and 40");
            hoursWorked = scanner.nextDouble();
        }
        scanner.close();

        double gross = hourRate * hoursWorked;
        System.out.println("Gross pay is $" + gross);
    }

    public static void addNumbers() {
        boolean again;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Insert first number");
            double num1 = scanner.nextDouble();

            System.out.println("Insert second number");
            double num2 = scanner.nextDouble();

            double sum = num2 + num1;

            System.out.println("The sum is : " + sum);

            System.out.println("Would you like to start over?   True or False");
            again = scanner.nextBoolean();

        }while (again);
        scanner.close();

    }

    public static void cashierProgram() {
        System.out.println("Enter the number of items you would you like to scan:");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();

        double total = 0;

        for (int i = 0; i < quantity; i++) {
            System.out.println("Enter the cost of the item: ");
            double price = scanner.nextDouble();
            total += price;
        }
        scanner.close();

        System.out.println("Your total is: " + total);

    }

    public static void stringScan(){
        System.out.println("Enter your string");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        scanner.close();

        boolean letterFound = false;

        for (int i = 0; i < string.length(); i++) {
            char currentLetter = string.charAt(i);
            if (currentLetter == 'A' || currentLetter == 'a'){
                letterFound = true;
                break;
            }
        }

        if (letterFound){
            System.out.println("This text contains letter A");
        }else{
            System.out.println("This text does not contain letter A");
        }

    }

    public static void avgTestScore(){
        int numberOfStudents = 24;
        int numberOfTests = 4;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numberOfStudents; i++) {
            double total = 0;

            for (int j = 0; j < numberOfTests; j++) {
                System.out.println("Enter the score of the test #" + (j+1));
                double score = scanner.nextDouble();
                total += score;
            }

            double avgerage = total/numberOfTests;
            System.out.println("The test average for student #" + (i+1) + " is " + avgerage);
        }
    }

}
