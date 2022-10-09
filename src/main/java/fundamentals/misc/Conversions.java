package fundamentals_java.misc;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Conversions {
    public static void main(String[] args) throws ParseException {
        stringToIntParseInt();
        stringToIntValueOf();
        stringToIntErrorFormat();
        intToString();
        intToStringValueOf();
        intToStringFormat();

        stringToDate1();
        dateToTimestamp();
    }

    static void stringToIntParseInt() {
        String s = "200";
        System.out.println("String adding:");
        System.out.println(s + 100);
        int i = Integer.parseInt(s);
        System.out.println("Int adding:");
        System.out.println(i + 100);
    }

    static void stringToIntValueOf() {
        String s = "200";
        Integer i = Integer.valueOf(s);
        System.out.println(s + 100);
        System.out.println(i + 100);
    }

    static void stringToIntErrorFormat() {
        String s = "nina";
        int i = Integer.parseInt(s);
        try {
            System.out.println(i);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }

    static void intToString() {
        int i = 200;
    }

    static void intToStringValueOf() {
        int i = 200;
    }

    static void  intToStringFormat() {
        int i = 200;
        String s = String.format("%d", i);
        System.out.println(s + 100);
    }

    static void stringToDate1() throws ParseException {
        String sDate = "31/12/1999";
        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate);
        System.out.println(sDate + "\t" + date1);
    }

    static void dateToTimestamp() {
        Date date = new Date();
        Timestamp ts=new Timestamp(date.getTime());
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(formatter.format(ts));
    }

}