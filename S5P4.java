import java.util.Scanner;
public class S5P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String a = sc.nextLine();
            String b = sc.nextLine();
            int num1 = Integer.parseInt(a);
            int num2 = Integer.parseInt(b);
            int result = num1 / num2;
            System.out.println(result);
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid number input");
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
    }
}
