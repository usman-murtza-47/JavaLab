class Book{
    String title;
    int price;
    Book(){
        title = "Null";
        price = 0;
    }
    Book(String t, int p){
        title = t;
        price = p;
    }
    void details(){
        System.out.println ("Title is: " + title);
        System.out.println ("Price is: " + price);
    }
}
class Main {
    public static void main(String[] args) {
        Book B1 = new Book ("ABC", 100);
        B1.details();
    }
}
