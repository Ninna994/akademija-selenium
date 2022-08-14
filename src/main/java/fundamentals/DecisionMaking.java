package fundamentals;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class DecisionMaking {
    public static void main(String[] args) {
        /*
        1. Let's say we have a team of salespeople, all of whom make a standard rate of $1,000 a week. For any of them who make more than 10 sales that week, they get an additional bonus of $250.
         */

        System.out.println("### Exercise 1 - Salary Calculator.");
        // salaryCalculator();

        /*
        All salespeople are expected to make at least 10sales each week.
        Those who do they receive congratulatory message.
         For those who don't they are informed of how many sales they were short
         */
        System.out.println("### Exercise 2 - Salary Expectations.");
        // salesCalculator();

        /*
        To qualify for a loan, a person must make at least 30 000 abd have been working at their curent job for at least 2years
         */
        System.out.println("### Exercise 3 - Loan Calculator.");
        // loanCalculator();

        /*
        Display a letter grade for a student based on their test score
         */
        System.out.println("### Exercise 4 - Grade calculator.");
        //testResults();

        /*
        Have a user enter their grade and using a switch statement print out a message letting them know how they did
         */
        System.out.println("### Exercise 5 - Grade explanations.");
        gradeExplanation();

    }

    public static void salaryCalculator() {
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        System.out.println("How many sales did the employee make this week?");
        Scanner scanner = new Scanner(System.in);

        int sales = scanner.nextInt();
        scanner.close();

        if (sales >= quota) {
            salary += bonus;
        }

        System.out.println("Employe's pay is $ " + salary);
    }

    public static void salesCalculator() {
        int expectedSales = 10;
        String congMessage = "Bravo";

        System.out.println("Insert your current sales number: ");

        Scanner scanner = new Scanner(System.in);
        int currentSales = scanner.nextInt();
        scanner.close();

        if (currentSales >= 10) {
            System.out.println(congMessage);
        } else {
            int needed = expectedSales - currentSales;
            System.out.println("You need to make " + needed + " more salary in order to get congratulatory message.");
        }
    }

    public static void loanCalculator(){
        int minYears = 2;
        int minMade = 30000;
        System.out.println("How much did you make last year?");
        Scanner scanner = new Scanner(System.in);
        System.out.println("How long have you been working at your current job?");
        int currentMade = scanner.nextInt();
        int currentWorked = scanner.nextInt();

        scanner.close();


        if (currentMade >= minMade) {
            if (currentWorked >= minYears) {
                System.out.println("You are qualified for a loan");
            } else {
                System.out.println("You are not qualified for loan. You need to work for at least " + minYears + " years");
            }
        } else {
            System.out.println("You are not qualified for loan. You need to make at least " + minMade + " euros");
        }
    }

    public static void testResults(){
        System.out.println("Enter your test score 0-100");
        Scanner scanner = new Scanner(System.in);
        double testResult = scanner.nextDouble();
        scanner.close();

        char grade;

        if (testResult < 60){
            grade = 'F';
        }else if(testResult < 70){
            grade = 'D';
        }else if (testResult < 80){
            grade = 'C';
        }else if(testResult < 90){
            grade = 'B';
        }else {
            grade = 'A';
        }

        System.out.println("Your grade is: " + grade);

    }

    public static void gradeExplanation(){
        System.out.println("Insert your grade:");
        Scanner scanner =  new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();
        String message;

        switch (grade){
            case "A":
                message = "You did great";
                break;
            case "B":
                message = "Not great not terrible";
                break;
            case "C":
                message = "You can do better";
                break;
            case "D":
                message = "That was close";
                break;
            case "F":
                message = "See you next year";
                break;
            default:
                message = "Invalid grade";
                break;
        }
        System.out.println(message);
    }
}
