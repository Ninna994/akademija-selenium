package fundamentals;

public class TestEmployee1 {
    public static void main(String[] args) {
        Employee1[] staff = new Employee1[3];
        staff[0] = new Employee1("Nikolina Djekic", 75000, 1994, 6, 4);
        staff[1] = new Employee1("Nina Test", 1000, 1992, 5, 3);
        staff[2] = new Employee1("Nina Test 3", 750, 1990, 1, 31);

        // podigni svima platu 5%

        for (Employee1 e : staff)
            e.raiseSalary(5);

        for (Employee1 e: staff)
            System.out.println("Name: " + e.getEmployeeName() + ", salary: " + e.getEmployeeSalary() + ", hireDay: " +e.getHireDay());
    }

}
