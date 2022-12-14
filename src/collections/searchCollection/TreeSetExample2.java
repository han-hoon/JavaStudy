package collections.searchCollection;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample2 {

    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<>();
        scores.add(new Integer(87));
        scores.add(new Integer(98));
        scores.add(new Integer(75));
        scores.add(new Integer(95));
        scores.add(new Integer(80));

        NavigableSet<Integer> desceSet = scores.descendingSet();
        for(Integer score : desceSet) {
            System.out.print(score + " ");
        }
        System.out.println();

        NavigableSet<Integer> ascendSet = desceSet.descendingSet();
        for(Integer score : ascendSet) {
            System.out.print(score + " ");
        }
        System.out.println();

        NavigableSet<Integer> rangeSet = scores.subSet(new Integer(80), true, new Integer(95), true);
        for(Integer score : rangeSet) {
            System.out.print(score + " ");
        }
    }
}