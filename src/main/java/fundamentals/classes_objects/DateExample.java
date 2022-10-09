package fundamentals_java.classes_objects;

import java.util.Date;

public class DateExample {
    public static void main(String[] args) {
        // to construct constructor we use new keyword
        new Date();
        // prints datetime timestamp
        System.out.println("Direct object: " + new Date());
        //we can add object and methods to variable, on of them od .toString()
        String s = new Date().toString();
        System.out.println("String variable: " + s);
        // instead of using new object of Date class everytime we can declare date in new variable and save it like bellow
        Date todaysDay = new Date();
        System.out.println("Variable todaysDay is: " + todaysDay );
        //we can access all methods of Date class, and every other class by CRTL+Click on Class name or by typing variable that points to that Class and typing . or CTRL+J
        //deprecated methods - getMonth, getYear
    }
}
