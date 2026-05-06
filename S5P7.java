public class S5P7 {
    static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Not eligible");
        }
        System.out.println("Eligible");
    }
    public static void main(String[] args) {
        try {
            checkAge(16);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
