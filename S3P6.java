class Person {
    String name;
    int age;

    Person(String n, int a) {
        name = n;
        age = a;
    }
}

class Patient extends Person {
    String disease;
    String doctorAssigned;

    Patient(String n, int a, String d, String doc) {
        super(n, a);
        disease = d;
        doctorAssigned = doc;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Disease: " + disease);
        System.out.println("Doctor Assigned: " + doctorAssigned);
    }
}

public class Main {
    public static void main(String[] args) {
        Patient p = new Patient("Krrish", 20, "Fever", "Dr. Sharma");
        p.display();
    }
}
