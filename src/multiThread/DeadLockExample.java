package multiThread;

public class DeadLockExample {
    public static Object Lock1 = new Object();
    public static Object Lock2 = new Object();

    public static void main(String args[]) {
        Thread1 T1 = new Thread1();
        Thread2 T2 = new Thread2();
        T1.setPriority(Thread.MAX_PRIORITY);
        T2.setPriority(Thread.MIN_PRIORITY);
        T1.start();
        T2.start();
    }

    private static class Thread1 extends Thread {
        public void run() {
            synchronized (Lock1) {
                System.out.println("Thread1: lock 1 점유");
                try { Thread.sleep(10); }
                catch (InterruptedException e) {}
                System.out.println("Thread1: lock 2 점유대기");
                synchronized (Lock2) {
                    System.out.println("Thread1: 1 ,2 점유");
                }
            }
        }
    }
    private static class Thread2 extends Thread {
        public void run() {
            synchronized (Lock2) {
                System.out.println("Thread2: lock 1 점유");
                try { Thread.sleep(10); }
                catch (InterruptedException e) {}
                System.out.println("Thread2: lock 2 점유대기");
                synchronized (Lock1) {
                    System.out.println("Thread2: 1 ,2 점유");
                }
            }
        }
    }
}