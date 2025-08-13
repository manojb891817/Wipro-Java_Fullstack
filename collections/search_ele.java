
import java.util.ArrayList;
import java.util.List;

public class search_ele {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("red");
        list.add("green");
        list.add("Orange");
        list.add("White");
        list.add("Black");

        if(list.contains("red")){
            System.out.println("the element is found ");
        }
        else{
            System.out.println("The element is not found ");
        }

    }

}