package exception;

public class Account {

    private long balance;

    public Account() {}

    public long getBalance() {
        return balance;
    }

    public void deposit(int money) {
        balance += money;
    }

    public void winthdraw(int money) throws BalanceInsufficientExeception {
        if(balance < money) {
            throw new BalanceInsufficientExeception("잔고부족: " +(money - balance) + "원 부족.");
        }
        balance -= money;
    }
}
