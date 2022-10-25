package collections.syncroiedCollection;

import java.util.*;

public class Example {

    public static void main(String[] args) {
        List<String> list = Collections.synchronizedList(new ArrayList<>());
        Set<String> set = Collections.synchronizedSet(new HashSet<>());
        Map<String, Integer> map = Collections.synchronizedMap(new HashMap<>());

        System.out.println(list.getClass().getName());
        System.out.println(set.getClass().getName());
        System.out.println(map.getClass().getName());
    }
}
