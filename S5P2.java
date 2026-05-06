public class S5P2 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        try {
            System.out.println(arr[7]);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index");
        } 
    }
}
