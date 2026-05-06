class InvalidNameException extends Exception {
    InvalidNameException(String msg) {
        super(msg);
    }
}

class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) {
        super(msg);
    }
}

class InvalidEmailException extends Exception {
    InvalidEmailException(String msg) {
        super(msg);
    }
}

public class Registration {
    public static void main(String[] args) {
        String name = "";
        int age = 16;
        String email = "testgmail.com";

        try {
            if (name.isEmpty())
                throw new InvalidNameException("Name cannot be empty");
            if (age < 18)
                throw new InvalidAgeException("Age must be 18+");
            if (!email.contains("@"))
                throw new InvalidEmailException("Invalid email");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
