package multiThread.wait;

public class WorkObject {
    public synchronized void methodA() {
        System.out.println("TheadA의 methodA에서 작업 실행");
        notify();
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void methodB() {
        System.out.println("TheadB의 methodB에서 작업 실행");
        notify();
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
