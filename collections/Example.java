

import java .util.*;

public class Example {
    public static void main(String[] args){
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"A");
        map.put(2,"b");

        System.out.println(map);

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        System.out.println(list);

        Set<Integer> set = new HashSet<>(list);
        System.out.println(set);






    }

}