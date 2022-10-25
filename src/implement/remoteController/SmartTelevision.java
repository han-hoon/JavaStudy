package implement.remoteController;

public class SmartTelevision implements RemoteController, Searchable {

    private int volume;

    @Override
    public void turnOn() {
        System.out.println("Smart TV를 켭니다");
    }

    @Override
    public void trunOff() {
        System.out.println("Smart TV를 끕니다");
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
        System.out.println("Smart TV 현재 볼륨 : " + this.volume);
    }

    @Override
    public void seach(String url) {
        System.out.println(url + "을 검색합니다. ");
    }
}
