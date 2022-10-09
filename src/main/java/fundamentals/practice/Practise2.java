package fundamentals.practice;

import java.util.Scanner;

public class Practise2 {
        public static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args){
            System.out.println("******\nPractise task 1\n******");
            promptUntilQPressed();
            System.out.println("******\nPractise task 2\n******");
            factoriel();
            System.out.println("******\nPractise task 3\n******");
            System.out.println("******\nPractise task 4\n******");
            scanner.close();
        }

        public static void promptUntilQPressed() {
            /*
            Write program that prompts user to insert character until he inserts "q"
             */
            String command;
            do {
                System.out.println("Insert character on keyboard:");
               command =  scanner.next();
            } while (!command.equalsIgnoreCase("q"));
        }

        public static  void factoriel() {
            /*
            Write a program that calculates factoriel of any number between 1 and 100
             */
            System.out.println("Insert number between 1 and 10");
            int number = scanner.nextInt();
            int factorielNum = 1;
            for (int i = 1; i <= number; i++) {
                factorielNum *= i;
            }
            System.out.println(factorielNum);
        }

}
