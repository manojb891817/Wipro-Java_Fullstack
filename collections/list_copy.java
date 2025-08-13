
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class list_copy {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("red");
        list1.add("green");
        list1.add("Orange");
        list1.add("White");
        list1.add("Black");


        List<String> list2 = new ArrayList<>();
        list2.add("a");
        list2.add("b");
        list2.add("c");
        list2.add("d");
        list2.add("e");

        Collections.copy(list1,list2);
        System.out.println(list1);


    }
}