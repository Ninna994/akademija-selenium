package fundamentals_java.classes_objects;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class CurrentCalendar {
    public static void main(String[] args) {
        // set locale for first day of week settings
        Locale.setDefault(Locale.UK);
        /*
        Make calendar view for current month
        Display current day with *
         */
        GregorianCalendar d = new GregorianCalendar();
        int today = d.get(Calendar.DAY_OF_MONTH);
        int month = d.get(Calendar.MONTH);
        // set first day of month and check what is its day of week
        d.set(Calendar.DAY_OF_MONTH, 1);
        int weekday = d.get(Calendar.DAY_OF_WEEK);
        int firstDayOfWeek = d.getFirstDayOfWeek();
        // indent set
        int indent = 0;
        while (weekday != firstDayOfWeek) {
            indent++;
            d.add(Calendar.DAY_OF_MONTH, -1);
            weekday = d.get(Calendar.DAY_OF_WEEK);
        }

        // header print
        String[] weekdayNames = new DateFormatSymbols().getShortWeekdays();
        do {
            System.out.printf("%4s", weekdayNames[weekday]);
            d.add(Calendar.DAY_OF_MONTH, 1);
            weekday = d.get(Calendar.DAY_OF_WEEK);
        } while (weekday != firstDayOfWeek);
        System.out.println();

        for (int i = 1; i <= indent; i++) {
            System.out.print("    ");
        }

        d.set(Calendar.DAY_OF_MONTH, 1);

        do {
            //print days
            int day = d.get(Calendar.DAY_OF_MONTH);
            System.out.printf("%3d", day);

            // mark current day with *
            if (day == today) System.out.print("*");
            else System.out.print(" ");

            //move d forward to next day
            d.add(Calendar.DAY_OF_MONTH, 1);
            weekday = d.get(Calendar.DAY_OF_WEEK);

            // new line on top of calendar
            if (weekday == firstDayOfWeek) System.out.println();
        } while (d.get(Calendar.MONTH) == month);
        // new line if necessary

        if (weekday != firstDayOfWeek) System.out.println();

    }

}
