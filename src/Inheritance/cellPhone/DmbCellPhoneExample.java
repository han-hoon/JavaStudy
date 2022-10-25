package Inheritance.cellPhone;

public class DmbCellPhoneExample {

    public static void main(String[] args) {
        DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰","검정", 10);

        //CellPhone으로 부터 상속받은 필드
        System.out.println("모델: " + dmbCellPhone.model);
        System.out.println("생상: " + dmbCellPhone.color);

        // DmbCellPhone의 필드
        System.out.println("채널: " + dmbCellPhone.channel);

        // CellPhone으로부터 상송받은 메서드 호출
        dmbCellPhone.powerOn();
        dmbCellPhone.bell();
        dmbCellPhone.sendVoice("여보세요");
        dmbCellPhone.receiveVoice("안녕하세요! 저는 홍길동 인데요.");
        dmbCellPhone.sendVoice("반갑습니다.");
        dmbCellPhone.hangUp();

        // DmbCellPhone 메서드 호출
        dmbCellPhone.turnOnDmb();
        dmbCellPhone.changeChannel(12);
        dmbCellPhone.turnOffDmb();
    }
}
