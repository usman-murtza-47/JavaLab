class Student {
    String name;
    int marks;

    Student(String n, int m) {
        name = n;
        marks = m;
    }
}

class Result extends Student {
    char grade;

    Result(String n, int m) {
        super(n, m);
    }

    void computeGrade() {
        if (marks >= 90)
            grade = 'A';
        else if (marks >= 80)
            grade = 'B';
        else if (marks >= 70)
            grade = 'C';
        else if (marks >= 60)
            grade = 'D';
        else
            grade = 'F';
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }
}

public class Main {
    public static void main(String[] args) {
        Result r = new Result("Krrish", 98);
        r.computeGrade();
        r.display();
    }
}
