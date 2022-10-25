package multiThread.stopFlag;

public class StopFlagExample {

    public static void main(String[] args) {
        PrintThread thread = new PrintThread();
        thread.start();

        try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}

        thread.setStop(true);
    }

}
