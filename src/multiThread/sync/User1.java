package multiThread.sync;

public class User1 extends Thread {

    Calculator calculator = new Calculator();

    public void setCalculator(Calculator calculator) {
        setName("User1");
        this.calculator = calculator;
    }

    @Override
    public void run() {
        calculator.setMemory(100);
    }
}
