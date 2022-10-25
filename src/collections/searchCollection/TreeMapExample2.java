package collections.searchCollection;

import sun.reflect.generics.tree.Tree;

import java.util.*;

public class TreeMapExample2 {

    public static void main(String[] args) {
        HashMap<String, String> a = new HashMap<>();
        TreeMap<Integer, String> scores = new TreeMap<>();
        scores.put(new Integer(87), "홍길동");
        scores.put(new Integer(98), "이동수");
        scores.put(new Integer(75), "박길순");
        scores.put(new Integer(95), "신용권");
        scores.put(new Integer(80), "김자바");

        NavigableMap<Integer, String> desceMap = scores.descendingMap();
        Set<Map.Entry<Integer, String>> desceEntrySet = desceMap.entrySet();
        for (Map.Entry<Integer, String> entry: desceEntrySet) {
            System.out.print(entry.getKey() + "-" + entry.getValue() + ", ");
        }
        System.out.println();

        NavigableMap<Integer, String> ascendMap = desceMap.descendingMap();
        Set<Map.Entry<Integer, String>> ascendEntrySet = ascendMap.entrySet();
        for (Map.Entry<Integer, String> entry: ascendEntrySet) {
            System.out.print(entry.getKey() + "-" + entry.getValue() + ", ");
        }
    }

}
