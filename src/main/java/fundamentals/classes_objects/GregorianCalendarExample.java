package fundamentals.classes_objects;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregorianCalendarExample {
    public static void main(String[] args) {
        // has more methods than Date object and several constructors
        //1. date and time of object creation
        GregorianCalendar gcObject = new GregorianCalendar();
        System.out.println("Just object created: " + gcObject);
        //2. pass y,m,d
        GregorianCalendar ymd = new GregorianCalendar(1999, 11,31);
        System.out.println("Year, month, day " + ymd);
        //months start from 0 - December is 11th month. To eliminate strange behaviours we can use constants - Calendar.MONTH_NAME
        GregorianCalendar calendarDecember = new GregorianCalendar(1999, Calendar.DECEMBER, 31);
        System.out.println("Calendar.DECEMBER used: " + calendarDecember);
        // set time and date
        GregorianCalendar dateTime = new GregorianCalendar(1999, Calendar.DECEMBER, 31, 23,59,59);
        System.out.println("Date and time: " + dateTime);

        /*
        How to get information from GregorianCalendar Class?
         */

        GregorianCalendar now = new GregorianCalendar();
        int month = now.get(Calendar.MONTH);
        int weekday = now.get(Calendar.DAY_OF_WEEK);
        System.out.println("today is " + month +" month and " + weekday + "day of week");

        /*
        How to set information to variable pointing to object
         */

        GregorianCalendar deadline = new GregorianCalendar();
        deadline.set(Calendar.YEAR, 2001);
        deadline.set(Calendar.MONTH, Calendar.APRIL);
        deadline.set(Calendar.DAY_OF_MONTH, 15);
        System.out.println("Initial deadline is set to be: " + deadline.getTime());
        //or shorter:
        // deadline.set(2001, Calendar.APRIL, 15);
        // add  days to deadline
        deadline.add(Calendar.DATE, 5);
        System.out.println("New deadline after 5 days extension is: " + deadline.getTime());
        //substract 5 days from deadline
        deadline.add(Calendar.DATE, -10);
        System.out.println("New deadline after we substracted 10 days is: " + deadline.getTime());
    }
}
