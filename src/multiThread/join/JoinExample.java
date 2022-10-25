package multiThread.join;

public class JoinExample {

    public static void main(String[] args) {
        SumThread thread = new SumThread();
        thread.start();
        try { thread.join(); } catch (InterruptedException e) { e.printStackTrace(); }
        System.out.println("sum : " + thread.getSum());
    }
}

class SumThread extends Thread {
    private long sum;
    public long getSum() {
        return sum;
    }
    public void setSum(long sum) {
        this.sum = sum;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            sum+=i;
        }
    }
}
