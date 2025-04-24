package ch03.sec04;

public class AccuracyExample1 {
    public static void main(String[] args) {
        int apple = 1;
        double pieceUnit = 0.1;
        int number =7;

        double result = apple - number * pieceUnit;
        System.out.println("사과 1개에서 남은 양:" + result);
        // 사과 1개를 0.1단위의 10조각으로 보고 그중 7조각을 뺀 나머지를 result에 저장
        // 정확한 계산이 필요하다면 정수 연산으로 변경하는 것이 좋음
    }
}
