class Student{
    int [] marks = new int [5];
   Student(int m1, int m2, int m3, int m4, int m5){
    marks [0] = m1;
    marks [1] = m2;
    marks [2] = m3;
    marks [3] = m4;
    marks [4] = m5;
    }
    void average(){
        double sum = 0;
        for (int i=0; i<5; i++){
            sum += marks[i];
        }
        System.out.println ("Average is: " + sum/5);
    }
}
class Main {
    public static void main(String[] args) {
        Student S = new Student (97,93,95,98,99);
        S.average();
    }
}
