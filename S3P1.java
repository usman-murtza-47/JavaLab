class Person {
    String name;
    int age;

    Person(String n, int a) {
        name = n;
        age = a;
    }
}

class Student extends Person {
    int rollNo;
    String course;

    Student(String n, int a, int r, String c) {
        super(n, a);
        rollNo = r;
        course = c;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student("Krrish", 20, 101, "B.Tech");
        s.display();
    }
}
