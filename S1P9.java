import java.util.*;
public class S1P9 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7);
        System.out.println(findCommonElements(list1, list2));
    }
    public static List<Integer> findCommonElements(List<Integer> list1, List<Integer> list2) {
        list1.retainAll(list2);
        return list1;
    }
}
