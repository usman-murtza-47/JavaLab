import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 5000;

        try {
            System.out.print("Enter amount: ");
            int amount = sc.nextInt();

            if (amount < 0)
                throw new ArithmeticException("Negative amount not allowed");
            if (amount > balance)
                throw new Exception("Insufficient balance");

            System.out.println("Withdraw successful");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
