package ch06.sec08.exam02;

public class Computer {
    //가변길이 매개변수를 갖는 메소드 선언
    int sum(int ... values) { // int 형의 가변 인자 값을 받는 메소드
        //sum 변수 선언
        int sum = 0;  // 합을 저장할 변수 sum을 0으로 초기화

        // values는 배열처럼 사용됨 (가변 인자 -> 내부적으로 배열로 처리됨)
        for (int i = 0; i < values.length; i++) { // values 배열의 모든 요소를 반복
            sum += values[i]; // values 배열의 각 요소를 sum에 더함
        }

        //합산 결과를 리턴
        return sum; // 계산된 sum 값을 리턴
    }
}
