package implement.remoteController;

public class Audio implements  RemoteController {

    private int volume;
    private boolean mute;

    @Override
    public void turnOn() {
        System.out.println("Audio를 켭니다.");
    }

    @Override
    public void trunOff() {
        System.out.println("Audio를 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if(volume > RemoteController.MAX_VOLUME) {
            this.volume = volume;
        } else if(volume < RemoteController.MIN_VOLUME) {
            this.volume = volume;
        } else {
            this.volume = volume;
        }
        System.out.println("Audio 현재 볼륨 : " + this.volume);
    }

    @Override
    public void setMute(boolean mute) {
        this.mute = mute;
        if(mute) {
            System.out.println("Audio 음소거합니다.");
        } else {
            System.out.println("Audio 음소거 해제합니다.");
        }
    }
}
