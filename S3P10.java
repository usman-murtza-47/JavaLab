class Recharge {
    String mobileNumber;
    double planAmount;

    Recharge(String m, double p) {
        mobileNumber = m;
        planAmount = p;
    }
}

class DataRecharge extends Recharge {
    double dataLimit;

    DataRecharge(String m, double p, double d) {
        super(m, p);
        dataLimit = d;
    }

    void display() {
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Plan Amount: " + planAmount);
        System.out.println("Data Limit: " + dataLimit + " GB");
        System.out.println("Benefits: Unlimited Calls + Daily Data");
    }
}

public class Main {
    public static void main(String[] args) {
        DataRecharge r = new DataRecharge("6005860025", 299, 1.5);
        r.display();
    }
}
