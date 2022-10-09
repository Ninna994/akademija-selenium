package fundamentals_java.classes_objects;

public class Student {
    int id;
    String name;
    Address address;

    public Student(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public static void main(String[] args) {
        Address address1 = new Address("Podgorica", "State1", "Montenegro");
        Address address2 = new Address("Beograd", "State2", "Serbia");

        Student student1 = new Student(1, "Student1", address1);
        Student student2 = new Student(2, "Student2", address2);

        student1.display();
        student2.display();
    }

    void display() {
        System.out.println(id + " " + name);
        System.out.println(address.city + " " + address.state + " " + address.country);
    }
}
