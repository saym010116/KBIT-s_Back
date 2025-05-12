package ch15.sec06.exam01;
// LIFO 구조
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Stack 컬렉션 생성_stack은 후입선출
        Stack<Coin> coinBox = new Stack<Coin>();

        // 동전 넣기(넣은 순서: 100>50>500>10), 가장 나중에 들어간 10원이 맨 위에 있음
        coinBox.push(new Coin(100));
        coinBox.push(new Coin(50));
        coinBox.push(new Coin(500));
        coinBox.push(new Coin(10));

        // 동전을 하나씩 꺼내기, .pop()은 맨위의 객체를 꺼내고 제거함
        while(!coinBox.isEmpty()){
            Coin coin = coinBox.pop();
            System.out.println("꺼내온 동전: "+ coin.getValue()+"원");
        }
    }
}
