package fundamentals;

import java.util.Date;
import java.util.GregorianCalendar;

class Employee1 {
    //fields of object
    private String employeeName;
    private double employeeSalary;
    private Date hireDay;

    // constructors

    public Employee1(String name, double salary, int year, int month, int day) {
        employeeName = name;
        employeeSalary = salary;
        GregorianCalendar calendar = new GregorianCalendar(year, month-1, day);
        hireDay = calendar.getTime();
    }

    // methods

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public Date getHireDay() {
        return hireDay;
    }

    public void setHireDay(Date hireDay) {
        this.hireDay = hireDay;
    }

    public void raiseSalary(double byPercent) {
        double raise = employeeSalary * byPercent / 100;
        employeeSalary += raise;
    }
}
