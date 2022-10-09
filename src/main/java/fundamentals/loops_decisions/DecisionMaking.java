package fundamentals_java.loops_decisions;

import java.util.Scanner;

public class DecisionMaking {
    public static void main(String[] args) {
        /*
        1. Let's say we have a team of salespeople, all of whom make a standard rate of $1,000 a week. For any of them who make more than 10 sales that week, they get an additional bonus of $250.
         */

        System.out.println("### Exercise 1 - Salary Calculator.");
         salaryCalculator();

        /*
        All salespeople are expected to make at least 10sales each week.
        Those who do they receive congratulatory message.
         For those who don't they are informed of how many sales they were short
         */
        System.out.println("### Exercise 2 - Salary Expectations.");
         salesCalculator();

        /*
        To qualify for a loan, a person must make at least 30 000 abd have been working at their curent job for at least 2years
         */
        System.out.println("### Exercise 3 - Loan Calculator.");
         loanCalculator();

        /*
        Display a letter grade for a student based on their test score
         */
        System.out.println("### Exercise 4 - Grade calculator.");
        testResults();

        /*
        Have a user enter their grade and using a switch statement print out a message letting them know how they did
         */
        System.out.println("### Exercise 5 - Grade explanations.");
        gradeExplanation();

        /*
        For inserted age check if user has 18+. If it does print Age is greater than 18.
         */
        System.out.println("### Exercise 6 - IF Age checker");
        ageChecker();

         /*
        For inserted number check if it is even or odd
         */
        System.out.println("### Exercise 7 - IF-ELSE Even or odd number");
        evenOddChecker();

        /*
        For inserted year check if it is leap or common
         */
        System.out.println("### Exercise 8 - IF-ELSE Leap year");
        leapYear();
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

    public static  void ageChecker(){
        System.out.println("Insert age to check: ");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        scanner.close();
        //checking the age
        if(age>18){
            System.out.print("Age is greater than 18");
        }
    }

    public static  void evenOddChecker(){
        System.out.println("Insert number to check: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        //checking the age
        if(number % 2 ==0){
            System.out.print("EVEN");
        }else{
            System.out.println("ODD");
        }
        /*
        or ternary:
        String output=(number%2==0)?"even number":"odd number";
         */
    }

    public static void leapYear(){
        System.out.println("Insert number to check: ");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        scanner.close();
        if ((year % 4 ==0) && (year % 100 != 0) || (year % 400 == 0)){
            System.out.println("LEAP");
        }else{
            System.out.println("COMMON");
        }

    }
}
