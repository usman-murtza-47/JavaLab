import java.util.ArrayList;
import java.util.Scanner;

public class S1P2 {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter number of names");
        Scanner s1 = new Scanner(System.in);
        int size = s1.nextInt();
        System.out.println("Enter target");
        int target = s1.nextInt();
        for(int i = 0; i < size; i++){
            System.out.println("Enter name");
            int num = s1.nextInt();
            arr.add(num);
        }
        
            arr.removeIf(n -> n == target);
        
    }    
}
