package ch05.sec10;

public class AdvancedForExample {
    public static void main(String[] args) {
        int[] scores ={95,71,84,93,87};
        int sum = 0;
        // p.191
        // for(타입 변수: 배열){ 실행문 } 항목의 개수만큼 반복한 후 자동으로 for을 빠져나간다.
        for (int score:scores) {
            sum += score;
        }
        System.out.println("점수 총합= "+sum);
        System.out.println("평균 점수= "+ (double)sum/scores.length);
    }
}
