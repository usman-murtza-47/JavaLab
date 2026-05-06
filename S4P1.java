class Result {
    private int marks;

    Result(int marks) {
        this.marks = marks;
    }

    public void viewResult() {
        System.out.println("Marks: " + marks);
    }

    void updateMarks(int m) {
        marks = m;
    }
}

class Admin {
    public static void main(String[] args) {
        Result r = new Result(80);
        r.viewResult();
        r.updateMarks(90);
        r.viewResult();
    }
}
