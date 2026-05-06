class Account {
    String name;
    double balance;
    Account(String n, double b) {
        name = n;
        balance = b;
    }
    void deposit(double x) {
        balance += x;
        displayBalance();
    }
    void displayBalance() {
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }
}
class Main {
    public static void main(String[] args) {
        Account A = new Account("Krrish", 1000);
        A.deposit(500);
    }
}
