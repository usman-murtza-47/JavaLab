class Order {
    private double price = 1000;

    public void applyDiscount(double discount) throws Exception {
        if (discount > 50)
            throw new Exception("Discount cannot exceed 50%");
        price = price - (price * discount / 100);
        System.out.println("Final Price: " + price);
    }
}

public class ECommerce {
    public static void main(String[] args) {
        Order o = new Order();

        try {
            o.applyDiscount(30);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
