class InvalidPasswordException extends Exception {
    InvalidPasswordException(String message) {
        super(message);
    }
}
public class S5P9 {
    static void checkPassword(String password) throws InvalidPasswordException {
        if (password.length() < 8) {
            throw new InvalidPasswordException("Invalid password");
        }
        System.out.println("Valid password");
    }
    public static void main(String[] args) {
        try {
            checkPassword("abc123");
        } catch (InvalidPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}
