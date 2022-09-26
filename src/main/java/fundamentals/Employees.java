package fundamentals;

public class Employees {
    double salary = 4000;
}

class Programmer extends Employees {
    int bonus = 1000;

    public static void main(String[] args) {
        Programmer p = new Programmer();
        System.out.println("Programer salary is " + p.salary);
        System.out.println("Programer bonus is " + p.bonus);
    }
}


