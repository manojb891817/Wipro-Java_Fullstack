
import java.util.ArrayList;
import java.util.List;

public class Insert {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("red");
        list.add("green");
        list.add("Orange");
        list.add("White");
        list.add("Black");

        System.out.println("the present list is :"+ list);

        list.add(0,"hello");
        System.out.println("the list after addeed at the 0th index "+list);

    }
}