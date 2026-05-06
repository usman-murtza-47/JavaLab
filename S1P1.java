import java.util.ArrayList;
import java.util.Scanner;

public class S1P1 {
    public static void main(String[] args){
        ArrayList<String> arr = new ArrayList<>();
        System.out.println("Enter number of names");
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner((System.in));
        int size = s1.nextInt();
        for(int i = 0 ; i< size; i++){
            System.out.println("Enter name");
            String name = s2.next();
            arr.add(name);
        }

        for(int i = 0; i < size; i++){
            System.out.println(arr.get(i));
        }


    }
}
