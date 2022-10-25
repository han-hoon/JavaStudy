package collections.conrrent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test1 {
    final static List<String> list = Collections.synchronizedList(new ArrayList<>());
    final static int nThreads = 100;
    public static void main(String[] args) throws Exception{
        runError();         // 동기화된 메서드를 여러번 호출하는 경우
        //runSuccess();     // 여러번 호출 시 별도로 동기화
    }
    // 동기화된 메서드를 여러번 호출하는 경우
    public static void runError() {
        System.out.println("runError Start");
        ExecutorService es = Executors.newFixedThreadPool(nThreads);
        for (int i = 0; i < nThreads; i++) {
            es.execute(new Runnable() {
                public void run() {
                    try {
                        list.add("111");
                        list.add("222");
                        list.add("333");
                        System.out.print("Thread : " + Thread.currentThread().getName() + "\t");
                        //System.out.println("list : " + list + " \t result : " + (list.size() == 3) );
                        System.out.println("list[2] : " + list.get(2));
                        list.clear();
                    } catch(Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        es.shutdown();
        System.out.println("runError End");
    }

    // 여러번 호출 시 별도로 동기화
    public static void runSuccess() {
        System.out.println("runSuccess Start");
        ExecutorService es = Executors.newFixedThreadPool(nThreads);
        for (int i = 0; i < nThreads; i++) {
            es.execute(new Runnable() {
                public void run() {
                    try {
                        synchronized (list) {
                            list.add("111");
                            list.add("222");
                            list.add("333");
                            System.out.print("Thread : " + Thread.currentThread().getName() + "\t");
                            //System.out.println("list : " + list + " \t result : " + (list.size() == 3) );
                            System.out.println("list[2] : " + list.get(2));
                            list.clear();
                        }
                    } catch(Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        es.shutdown();
        System.out.println("runSuccess End");
    }
}
