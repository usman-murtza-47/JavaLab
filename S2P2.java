class Rectangle{
    int length;
    int width;
    Rectangle(int l, int w){
        length = l;
        width = w;
    }
    void area(){
        System.out.println ("AREA is: " + length*width);
    }
}
class Main {
    public static void main(String[] args) {
        Rectangle R1 = new Rectangle (7,3);
        R1.area();
    }
}
