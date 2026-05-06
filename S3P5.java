class Account {
    int accNo;
    double balance;

    Account(int a, double b) {
        accNo = a;
        balance = b;
    }
}

class SavingsAccount extends Account {
    double interestRate;

    SavingsAccount(int a, double b, double r) {
        super(a, b);
        interestRate = r;
    }

    void calculateInterest() {
        double interest = balance * interestRate / 100;
        System.out.println("Account No: " + accNo);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate);
        System.out.println("Interest: " + interest);
    }
}

public class Main {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount(101, 50000, 5);
        s.calculateInterest();
    }
}
