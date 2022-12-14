package multiThread.a;

import java.awt.*;

public class BeepPrintExample {

    public static void main(String[] args) {
        Runnable beepTask = new BeepTask();
        Thread thread = new Thread(beepTask);
        thread.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try {Thread.sleep(500);} catch (Exception e) {e.printStackTrace();}
        }
    }
}

class BeepTask implements Runnable {
    @Override
    public void run() {
        Toolkit toolkit
                = Toolkit.getDefaultToolkit();

        for(int i = 0; i < 5; i++) {
            toolkit.beep();
            try { Thread.sleep(500); } catch (Exception e) {e.printStackTrace();}
        }
    }
}