class Employee{
    String name;
    int salary;
    String destination;
    Employee(String n, int s, String d){
        name = n;
        salary = s; 
        destination = d;
    }
    void details(){
        System.out.println ("Name is: " + name);
        System.out.println ("Salary is: " + salary);
        System.out.println ("Destination is: " + destination);
    }
}
class Main {
    public static void main(String[] args) {
        Employee E1 = new Employee ("ABC", 100000, "XYZ");
        E1.details();
    }
}
