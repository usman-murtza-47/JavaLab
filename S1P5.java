import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class S1P5 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("ENter size");
        Scanner s1 = new Scanner(System.in);
        int size = s1.nextInt();

        for(int i = 0; i < size; i++){
            System.out.println("Enter number");
            int num = s1.nextInt();
            arr.add(num);
        }
        int max = Collections.max(arr);
        int min = Collections.min(arr);

        System.out.println("Min no. is " + min + " MAx no. is " + max);
    }    
}
