import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S1P4 {
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

        Integer[] arr1 = {1,2,3,4,5};
        ArrayList<Integer> arr4 = new ArrayList<>();
        List<Integer> l= Arrays.asList(arr1);
        System.out.println("array to list" + l);
        Object[] arr2 = arr.toArray();

        Integer[] arr3 = new Integer[size];
        arr.toArray(arr3);
        System.out.println("list to array" + arr3);
        System.out.println("list to array" + arr2);
    }    
}
