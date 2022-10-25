package Inheritance.airplane;

public class SupersonicAirplaneExample {

    public static void main(String[] args) {
        SupersonicAirplane sa = new SupersonicAirplane();

        sa.takeOff();

        sa.flyMode = SupersonicAirplane.SUPERSONIC;
        sa.fly();
        sa.flyMode = SupersonicAirplane.NORMAL;
        sa.fly();
        sa.land();
    }

}
