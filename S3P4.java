class Product {
    String name;
    double price;

    Product(String n, double p) {
        name = n;
        price = p;
    }
}

class Electronics extends Product {
    int warrantyPeriod;

    Electronics(String n, double p, int w) {
        super(n, p);
        warrantyPeriod = w;
    }

    void display() {
        double finalPrice = price + (price * 0.18);
        System.out.println("Product Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Warranty Period: " + warrantyPeriod + " years");
        System.out.println("Final Price: " + finalPrice);
    }
}

public class Main {
    public static void main(String[] args) {
        Electronics e = new Electronics("Laptop", 50000, 2);
        e.display();
    }
}
