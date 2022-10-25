package multiThread.yield;

public class YieldExample {

    public static void main(String[] args) {
        ThreadA threadA = new ThreadA();
        ThreadB threadB = new ThreadB();

        threadA.start();
        threadB.start();

        try{ Thread.sleep(3000);} catch (InterruptedException e) {e.printStackTrace();}
        threadA.work = false;           // B만실행

        try{ Thread.sleep(3000);} catch (InterruptedException e) {e.printStackTrace();}
        threadA.work = true;           // A, B 둘다 실행

        try{ Thread.sleep(3000);} catch (InterruptedException e) {e.printStackTrace();}
        threadA.stop = true;
        threadB.stop = true;
    }

}
