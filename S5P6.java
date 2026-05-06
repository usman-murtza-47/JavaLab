public class S5P6 {
    public static void main(String[] args) {
        try {
            int x = 10 / 0;
        } 
        catch (ArithmeticException e) {
            System.out.println("Exception caught");
        } 
        finally {
            System.out.println("Finally block always executes");
        }
    }
}
