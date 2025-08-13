
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting_Array {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("red");
        list.add("green");
        list.add("Orange");
        list.add("White");
        list.add("Black");
        System.out.println("the unsorted list: "+list);
        Collections.sort(list);
        System.out.println("the sorted list: "+list);

    }
}