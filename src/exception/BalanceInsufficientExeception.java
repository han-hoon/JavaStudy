package exception;

public class BalanceInsufficientExeception extends Exception {

    public BalanceInsufficientExeception() {}

    public BalanceInsufficientExeception(String message) {
        super(message);
    }
}
