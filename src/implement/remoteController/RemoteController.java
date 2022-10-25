package implement.remoteController;

public interface RemoteController {

    public int MAX_VOLUME = 10;
    public int MIN_VOLUME = 1;

    public void turnOn();
    public void trunOff();
    public void setVolume(int volume);

    default void setMute(boolean mute) {
        if(mute) {
            System.out.println("음소거 합니다.");
        } else {
            System.out.println("음소거 해제합니다.");
        }
    }

    static void changeBattery() {
        System.out.println("건전지를 교환합니다.");
    }

}
