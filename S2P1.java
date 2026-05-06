class Student{
    String name;
    int rollno;
    Student (String n, int r){
        name = n;
        rollno = r;
    }
    public void display(){
        System.out.println ("Name is: "+ name);
        System.out.println ("Rollno is: "+ rollno);
    }
}
class Main {
    public static void main(String[] args) {
        Student S1 = new Student ("Krrish", 04);
        S1.display();
    }
}
