import java.util.Scanner;
public class S5P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            String input = sc.nextLine();
            int num = Integer.parseInt(input);
            System.out.println("Converted integer: " + num);
        } 
        catch (NumberFormatException e) {
            System.out.println("Please enter a integer");
        } 
    }
}
