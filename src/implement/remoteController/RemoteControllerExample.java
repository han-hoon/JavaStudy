package implement.remoteController;

public class RemoteControllerExample {

    public static void main(String[] args) {
        RemoteController rc = null;

        rc = new Television();
        rc.turnOn();
        rc.trunOff();
        rc.setMute(true);

        rc = new Audio();
        rc.turnOn();
        rc.trunOff();
        rc.setMute(true);

        RemoteController.changeBattery();

    }

}
