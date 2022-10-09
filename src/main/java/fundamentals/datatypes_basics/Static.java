package fundamentals.datatypes_basics;

public class Static {
    public static void main(String[] args) {
        int result = cube(5);
        // int result2 = Static.cube(5);
        System.out.println("Cube is: " + result);
       // System.out.println("Cube is: " + result2);
    }

     static int cube(int x) {
        return x*x*x;
    }
}
