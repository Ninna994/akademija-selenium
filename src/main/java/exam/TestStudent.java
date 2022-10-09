package exam;

public class TestStudent {
    public static void main(String[] args) {
        Student[] studentList = new Student[5];
        float total = 0;

        studentList[0] = new Student("Nikolina", 28, 1, 6.99);
        studentList[1] = new Student("Nina", 30, 2, 12.59);
        studentList[2] = new Student("Ina", 31, 4, 8.34);
        studentList[3] = new Student("Test", 22, 6, 11.27);
        studentList[4] = new Student("Nikolina Nina", 25, 1, 10.25);

        for (Student s : studentList) {
            System.out.println("Student name: " + s.getName() + ", age: " + s.getAge() + ", semester: " + s.getSemesterNo() + " and GPA is:" + s.getGpa());
        }

        for (Student s : studentList) {
            total += s.getGpa();
            System.out.println(total);
        }

        System.out.println("Total GPA is: " + total + " and average GPA is: " + total / (studentList.length));

    }
}
