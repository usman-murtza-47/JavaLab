import java.util.Scanner;
class InvalidMarksException extends Exception {
    InvalidMarksException(String message) {
        super(message);
    }
}
public class S5P10 {
    static void validate(int marks) throws InvalidMarksException {
        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException("Marks must be between 0 and 100");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        int sum = 0;
        try {
            for (int i = 0; i < 5; i++) {
                marks[i] = sc.nextInt();
                validate(marks[i]);
                sum += marks[i];
            }
            double avg = sum / 5.0;
            System.out.println("Average: " + avg);
        }
        catch (InvalidMarksException e) {
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Invalid input");
        }
    }
}
