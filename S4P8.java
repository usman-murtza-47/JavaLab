import java.util.Scanner;

class AccountLockedException extends Exception {
    AccountLockedException(String msg) {
        super(msg);
    }
}

public class LoginSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correct = "admin";

        for (int i = 1; i <= 3; i++) {
            try {
                System.out.print("Enter password: ");
                String pass = sc.nextLine();

                if (!pass.equals(correct))
                    throw new Exception("Wrong password");

                System.out.println("Login successful");
                return;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        try {
            throw new AccountLockedException("Account locked");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
