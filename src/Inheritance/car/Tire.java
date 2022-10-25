package Inheritance.car;

public class Tire {

    public int maxRotation;             // 최대 회전수(타이어 수명)
    public int accumulatedRotation;     // 누적 회전수
    public String location;             // 타이어의 위치

    public Tire(String location, int maxRotation) {
        this.maxRotation = maxRotation;
        this.location = location;
    }

    public boolean roll() {
        ++accumulatedRotation;
        if(accumulatedRotation < maxRotation) {
            System.out.println(location + " Tire 수명: " + (maxRotation - accumulatedRotation) +" 회");
            return true;
        } else {
            System.out.println("***" + location + " Tire 펑크 *** ");
            return false;
        }
    }
}

