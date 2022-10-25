package collections.lifoAndFifo;

import java.util.Stack;

class Coin {
    private int value;
    public Coin(int value) { this.value = value; }
    public int getValue() { return value; }
}
public class StackExample {
    public static void main(String[] args) {
        Stack<Coin> coinBox = new Stack<>();

        // 가장 위에 새 동전을 끼움
        coinBox.push(new Coin(100));
        coinBox.push(new Coin(50));
        coinBox.push(new Coin(500));
        coinBox.push(new Coin(10));

        while(!coinBox.isEmpty()) {     // 동전 박스가 비워질 때까지 반복
            Coin coin = coinBox.pop();      // 제일 위의 동전 꺼내기
            System.out.println("꺼내온 동전 :" + coin.getValue() + "원");
        }

    }
}
