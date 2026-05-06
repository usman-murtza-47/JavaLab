public class S5P8 {
    double balance = 1000;
    void withdraw(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient balance");
        }
        balance -= amount;
        System.out.println("Remaining balance: " + balance);
    }
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        try {
            acc.withdraw(1500);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
