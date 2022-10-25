package exception;

public class AccountExample {

    public static void main(String[] args) {
        Account account
                 = new Account();

        account.deposit(10000);
        System.out.println("예금액 : " + account.getBalance());

        try {
            account.winthdraw(30000);
        } catch (BalanceInsufficientExeception e) {
            String message = e.getMessage();
            System.out.println(message);
            System.out.println();
            e.printStackTrace();
        }

    }

}
