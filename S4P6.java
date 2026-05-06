class Employee {
    protected double salary = 50000;
}

class HR extends Employee {
    void modifySalary(double s) {
        salary = s;
    }
}

class Manager extends Employee {
    void showSalary() {
        System.out.println("Salary: " + salary);
    }
}

public class Payroll {
    public static void main(String[] args) {
        HR h = new HR();
        h.modifySalary(60000);

        Manager m = new Manager();
        m.showSalary();
    }
}
