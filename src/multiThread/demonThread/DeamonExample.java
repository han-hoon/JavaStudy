package multiThread.demonThread;

import java.util.Map;
import java.util.Set;

public class DeamonExample {
    public static void main(String[] args) {
        AutoSaveThread thread = new AutoSaveThread();
        thread.setDaemon(true);
        thread.start();
        try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
        System.out.println("메인 스레드 종료");
    }
}

class AutoSaveThread extends Thread {
    public void save() {
        System.out.println("작업 내용 저장");
    }
    @Override
    public void run() {
        while(true) {
            try{ Thread.sleep(1000); } catch (InterruptedException e) { break; }

            save();
        }
    }
}

class ThreadInfoExample {

    public static void main(String[] args) {
        AutoSaveThread autoSaveThread = new AutoSaveThread();
        autoSaveThread.setName("AutoSaveThread");
        autoSaveThread.setDaemon(true);
        autoSaveThread.start();

        Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
        Set<Thread> threads = map.keySet();

        for(Thread thread: threads) {
            System.out.println("이름 : " + thread.getName());
            System.out.println("소속 그룹 : " + thread.getThreadGroup());
            System.out.println();
        }
    }
}