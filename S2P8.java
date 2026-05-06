class Student {
    String name;
    int marks;
    Student(String n, int m) {
        name = n;
        marks = m;
    }
    void display() {
        System.out.println("Name: " + name + ", Marks: " + marks);
    }
}
class Main {
    public static void main(String[] args) {
        Student[] stud = new Student[3];
        stud[0] = new Student("KRRISH", 98);
        stud[1] = new Student("ABC", 90);
        stud[2] = new Student("XYZ", 93);
        for (int i = 0; i < stud.length; i++) {
            stud[i].display();
        }
    }
}
