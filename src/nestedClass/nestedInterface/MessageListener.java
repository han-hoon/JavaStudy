package nestedClass.nestedInterface;

public class MessageListener implements Button.OnCLickListener {
    @Override
    public void onClick() {
        System.out.println("메세지를 보냅니다.");
    }
}
