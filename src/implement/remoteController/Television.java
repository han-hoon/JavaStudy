package implement.remoteController;

public class Television implements  RemoteController {

    private int volume;

    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다");
    }

    @Override
    public void trunOff() {
        System.out.println("TV를 끕니다");
    }

    @Override
    public void setVolume(int volume) {
        if(volume > RemoteController.MAX_VOLUME) {
            this.volume = RemoteController.MAX_VOLUME;
        } else if(volume < RemoteController.MIN_VOLUME) {
            this.volume = RemoteController.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("Audio 현재 볼륨 : " + this.volume);
    }
}
