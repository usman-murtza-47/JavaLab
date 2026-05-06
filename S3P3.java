class Vehicle {
    String vehicleNo;
    String ownerName;

    Vehicle(String v, String o) {
        vehicleNo = v;
        ownerName = o;
    }
}

class Car extends Vehicle {
    String model;
    String fuelType;

    Car(String v, String o, String m, String f) {
        super(v, o);
        model = m;
        fuelType = f;
    }

    void display() {
        System.out.println("Vehicle No: " + vehicleNo);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Model: " + model);
        System.out.println("Fuel Type: " + fuelType);
    }
}

public class Main {
    public static void main(String[] args) {
        Car c = new Car("JK14J5718", "Krrish", "Swift", "Petrol");
        c.display();
    }
}
