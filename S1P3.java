import java.util.Scanner;
import java.util.ArrayList;

public class S1P3 {
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
        System.out.println("Enter target");
        int target = s1.nextInt();
        if(arr.contains(target)){
            System.out.println("Element present");
        }
        else{
            System.out.println("ELement not present");
        }

    }    
}
