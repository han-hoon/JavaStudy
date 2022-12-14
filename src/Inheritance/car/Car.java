package Inheritance.car;

public class Car {

    Tire frontLeftTire = new Tire("앞왼쪽", 6);
    Tire frontRightTire = new Tire("앞오른쪽", 2);
    Tire backLeftTire = new Tire("뒤왼쪽", 3);
    Tire backRightTire = new Tire("뒤오른쪽", 4);

    int run() {
        System.out.println("RUN");

        if(frontLeftTire.roll()==false) { stop(); return 1;}
        if(frontRightTire.roll()==false) { stop(); return 2;}
        if(backLeftTire.roll()==false) { stop(); return 3;}
        if(backRightTire.roll()==false) { stop(); return 4;}

        return 0;
    }

    private void stop() {
        System.out.println("STOP");

    }

}
