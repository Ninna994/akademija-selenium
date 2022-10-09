package fundamentals.datatypes_basics;

public class Operators {
    public static void main(String[] args) {
        System.out.println("Unary operators\n");
        //  unaryOperators();
        System.out.println("Arithmetic operators\n");
        //arithmeticOperators();
        System.out.println("Logical & Bitwise operators\n");
        //logicalOperators();
        System.out.println("Ternary operators\n");
        ternaryOperator();
    }

    private static void unaryOperators() {
         /*
        Unary operators ++ and --
         */
        int x = 10;
        System.out.println(x++);//10 (11)
        System.out.println(++x);//12
        System.out.println(x--);//12 (11)
        System.out.println(--x);//10
        int a = 10;
        int b = 10;
        System.out.println(a++ + ++a);//10+12=22
        System.out.println(b++ + b++);//10+11=21
        int c = 10;
        int d = -10;
        boolean e = true;
        boolean f = false;
        System.out.println(~c);//-11 (minus of total positive value which starts from 0)
        System.out.println(~d);//9 (positive of total minus, positive starts from 0)
        System.out.println(!e);//false (opposite of boolean value)
        System.out.println(!f);//true
    }

    private static void arithmeticOperators() {
        int a = 10;
        int b = 5;
        System.out.println(a + b);//15
        System.out.println(a - b);//5
        System.out.println(a * b);//50
        System.out.println(a / b);//2
        System.out.println(a % b);//0
        // stepenovanje u Javi
        System.out.println(10 * 10 / 5 + 3 - 1 * 4 / 2);
        System.out.println(10 << 2);//10*2^2=10*4=40
        System.out.println(10 << 3);//10*2^3=10*8=80
        System.out.println(20 << 2);//20*2^2=20*4=80
        System.out.println(15 << 4);//15*2^4=15*16=240
        System.out.println(10 >> 2);//10/2^2=10/4=2
        System.out.println(20 >> 2);//20/2^2=20/4=5
        System.out.println(20 >> 3);//20/2^3=20/8=2
    }

    private static void logicalOperators() {
        int a = 10;
        int b = 5;
        int c = 20;
        System.out.println(a < b && a < c);//false && true = false
        System.out.println(a < b & a < c);//false & true = false
        System.out.println(a < b && a++ < c);//false && true = false
        System.out.println(a);//10 because second condition is not checked
        System.out.println(a < b & a++ < c);//false && true = false
        System.out.println(a);//11 because second condition is checked

        System.out.println(a>b||a<c);//true || true = true
        System.out.println(a>b|a<c);//true | true = true
//|| vs |
        System.out.println(a>b||a++<c);//true || true = true
        System.out.println(a);//10 because second condition is not checked
        System.out.println(a>b|a++<c);//true | true = true
        System.out.println(a);//11 because second condition is checked
    }

    private static void ternaryOperator(){
        int a=2;
        int b=5;
        int min=(a<b)?a:b;
        System.out.println(min);

        int c=10;
        int d=5;
        int minimum=(c<d)?c:d;
        System.out.println("Minimum value is " + minimum);
    }

    private static void assignmentOperators(){
        int a=10;
        int b=20;
        a+=4;//a=a+4 (a=10+4)
        b-=4;//b=b-4 (b=20-4)
        System.out.println(a);
        System.out.println(b);
        int c=10;
        c+=3;//10+3
        System.out.println(c);
        c-=4;//13-4
        System.out.println(c);
        c*=2;//9*2
        System.out.println(c);
        c/=2;//18/2
        System.out.println(c);
    }
}
