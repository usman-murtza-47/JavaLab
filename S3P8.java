class Order {
    int orderId;
    double amount;

    Order(int id, double amt) {
        orderId = id;
        amount = amt;
    }
}

class OnlineOrder extends Order {
    double deliveryCharge;

    OnlineOrder(int id, double amt, double dc) {
        super(id, amt);
        deliveryCharge = dc;
    }

    void calculateBill() {
        double finalBill = super.amount + deliveryCharge;
        System.out.println("Order ID: " + orderId);
        System.out.println("Amount: " + amount);
        System.out.println("Delivery Charge: " + deliveryCharge);
        System.out.println("Final Bill: " + finalBill);
    }
}

public class Main {
    public static void main(String[] args) {
        OnlineOrder o = new OnlineOrder(101, 1500, 100);
        o.calculateBill();
    }
}
