package collections.conrrent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test2 {

    public static void main(String[] args) {
        final List<String> list = new CopyOnWriteArrayList<>();
        final int nThreads = 100;
        ExecutorService es = Executors.newFixedThreadPool(nThreads);

        for (int i = 0; i < nThreads; i++) {
            es.execute(new Runnable() {
                public void run() {
                    try {
                        list.add("111");
                        list.add("222");
                        list.add("333");
                        System.out.print("Thread : " + Thread.currentThread().getName() + "\t");
                        System.out.println("list : " + list + " \t result : " + (list.size() == 3) );
                        list.clear();
                    } catch(IndexOutOfBoundsException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        es.shutdown();
    }

}
