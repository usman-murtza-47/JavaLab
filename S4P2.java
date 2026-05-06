class BankAccount {
    private double balance = 5000;
    protected String accountType = "Savings";

    void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }

    public void checkBalance() {
        System.out.println("Balance: " + balance);
    }
}

class PremiumAccount extends BankAccount {
    public void showType() {
        System.out.println("Type: " + accountType);
    }

    public static void main(String[] args) {
        PremiumAccount p = new PremiumAccount();
        p.checkBalance();
        p.showType();
    }
}
