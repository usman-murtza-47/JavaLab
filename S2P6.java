class Car{
    String brand;
    int price;
    Car(String b, int p){
        brand = b;
        price = p;
    }
    Car (){
        this ("Unknown", 0);
    }
    void details(){
        System.out.println ("Brand is: " + brand);
        System.out.println ("Price is: " + price);
    }
}
class Main {
    public static void main(String[] args) {
        Car C1 = new Car ("ABC", 1000000);
        Car C = new Car();
        C.details();
        C1.details();
    }
}
