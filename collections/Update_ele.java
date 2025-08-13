
import java.util.ArrayList;
import java.util.List;

public class Update_ele {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("red");
        list.add("green");
        list.add("Orange");
        list.add("White");
        list.add("Black");


        System.out.println("the present ArryList: "+ list);
        list.set(1,"Blue");
        System.out.println("the updated ArrayList:"+list);
    }
}