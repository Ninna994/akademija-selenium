package fundamentals_java.misc;

public class ExceptionExample {
    public static void main(String[] args) {
       arithmeticException();
    nullException();
    arrayException();
    }
    // Methods that throw exceptions
    static void arithmeticException() {
        try {
            int data = 100/0;
        }catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("Rest of code goes here");
    }

    static void nullException() {
        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }

    static void arrayException() {
        try {
            int[] a=new int[5];
            a[10]=50;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

    }


}
