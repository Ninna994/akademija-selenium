package fundamentals_java.exam;

public class Student {
    /*
    Write a java class called Student. The Student class will have four data
members: name (a string), age (an int), semesterNo (an int), and GPA (a
double).

Write a java program to test your Student class. Your program should:
Create three Student objects, enter their name, age, semesterNo (assuming a
value from 1 to 8), and GPA(assuming value from 0.0 to 4.0) and display the
data for each Student. Continuing the Student class, calculate and display the
average GPA of the three Students.
     */
    private String name;
    private int age;
    private int semesterNo;
    private double gpa;

    // constructors

    public Student(String studentName, int studentAge, int studentSemesterNo, double studentGpa) {
        name = studentName;
        age = studentAge;
        semesterNo = studentSemesterNo;
        gpa = studentGpa;
    }

    // getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSemesterNo() {
        return semesterNo;
    }

    public void setSemesterNo(int semesterNo) {
        this.semesterNo = semesterNo;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

}
