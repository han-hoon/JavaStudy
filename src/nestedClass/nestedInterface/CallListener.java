package nestedClass.nestedInterface;

public class CallListener implements Button.OnCLickListener {

    @Override
    public void onClick() {
        System.out.println("전화를 겁니다.");
    }
}
