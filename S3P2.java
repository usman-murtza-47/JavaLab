class Employee {
    String name;
    double baseSalary;

    Employee(String n, double b) {
        name = n;
        baseSalary = b;
    }
}

class Manager extends Employee {
    double bonus;

    Manager(String n, double b, double bo) {
        super(n, b);
        bonus = bo;
    }

    void calculateTotalSalary() {
        double total = baseSalary + bonus;
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + total);
    }
}

public class Main {
    public static void main(String[] args) {
        Manager m = new Manager("Krrish", 50000, 10000);
        m.calculateTotalSalary();
    }
}
