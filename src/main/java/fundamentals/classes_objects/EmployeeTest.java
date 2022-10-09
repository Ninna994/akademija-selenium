package fundamentals_java.classes_objects;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Nikolina Djekic", 75000, 1994, 6, 4);
        staff[1] = new Employee("Nina Test", 1000, 1992, 5, 3);
        staff[2] = new Employee("Nina Test 3", 750, 1990, 1, 31);

        // podigni svima platu 5%

        for (Employee e : staff)
            e.raiseSalary(5);

        for (Employee e: staff)
            System.out.println("Name: " + e.getEmployeeName() + ", salary: " + e.getEmployeeSalary() + ", hireDay: " +e.getHireDay());
    }

}

