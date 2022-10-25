package multiThread.a;

public class ThreadExample {
    public static void main(String[] args) {

    }
}

// Thread 클래스 확장
class Thread1 extends Thread{
    @Override
    public void run() { super.run(); }
}

// Runnable 인터페이스 구현
class Thread2 implements Runnable {
    @Override
    public void run() {  }
}