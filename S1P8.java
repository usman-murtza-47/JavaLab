import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class S1P8 {
    public static void main(String[] args) {
        String[] arr = {"apple","banana","apple","orange","banana","orange","banana"};

        List <String> words = Arrays.asList(arr);

        // System.out.println(words);

        HashMap<String,Integer> h1 = new HashMap<>();
        h1.put(words.get(0),1);
        System.out.println(h1.get(words.get(0)));

        for (int i = 1; i < arr.length; i++) {
            // h1.merge(words.get(i),1,Integer::sum);
            if(h1.containsKey(words.get(i))){
                h1.get(h1.containsKey(words.get(i))) += 1;
            }
        }

    }
}
