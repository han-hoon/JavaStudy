package collections.compare;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class Fruit {
    public String name;
    public int price;
    public Fruit(String name, int price) {
        this.name = name;
        this.price = price;
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        /*
        TreeSet<Fruit> treeSet = new TreeSet<>();
        //Fruit이 Comparator을 구현하기 않았기 때문에 예외 발생
        //collections.compare.Fruit cannot be cast to java.lang.Comparable
        treeSet.add(new Fruit("포도", 3000));
        treeSet.add(new Fruit("수박", 10000));
        treeSet.add(new Fruit("딸기", 6000));
         */
        TreeSet<Fruit> treeSet = new TreeSet<>( (o1,o2) -> { return o1.price - o2.price; }); // 정렬자(Comparator) 제공
        treeSet.add(new Fruit("포도", 3000));
        treeSet.add(new Fruit("수박", 10000));
        treeSet.add(new Fruit("딸기", 6000));

        Iterator<Fruit> iterator = treeSet.iterator();
        while(iterator.hasNext()) {
            Fruit fruit = iterator.next();
            System.out.println(fruit.name + " : " + fruit.price);
        }

    }

}
