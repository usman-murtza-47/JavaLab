import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class S1P7 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter size");
        Scanner s1 = new Scanner(System.in);
        int size = s1.nextInt();

        for(int i = 0; i < size; i++){
            System.out.println("Enter number");
            int num = s1.nextInt();
            arr.add(num);
        }
        Collections.sort(arr);

        System.out.println("Ascending order " + arr);

        Collections.sort(arr,Collections.reverseOrder());
        System.out.println("Descending" + arr);
    }
}
