public class S5P11 {
    public static void main(String[] args) {
        try {
            try {
                int x = 10 / 0;
            } 
            catch (ArithmeticException e) {
                System.out.println("Division by zero");
            }
            int[] arr = new int[3];
            System.out.println(arr[5]);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index");
        }
    }
}
