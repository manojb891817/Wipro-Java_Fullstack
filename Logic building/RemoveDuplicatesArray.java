import java.util.LinkedHashSet;

public class RemoveDuplicatesArray {
    public static void main(String[] args) {
        int[] arr = {12, 34, 12, 45, 67, 89};
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int n : arr) set.add(n);
        System.out.print("O/P: ");
        System.out.println(set);
    }
}