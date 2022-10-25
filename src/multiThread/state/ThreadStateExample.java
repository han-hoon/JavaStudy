package multiThread.state;

public class ThreadStateExample {
    public static void main(String[] args) {
        StatePrintThread thread = new StatePrintThread(new TargetThread());

        thread.start();
    }

}
