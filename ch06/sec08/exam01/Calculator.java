package ch06.sec08.exam01;

public class Calculator {
    //리턴값이 없는 메소드 선언(전원을 켜는 메소드)
    void powerOn(){
        System.out.println("전원을 켭니다.");
    }

    //리턴값이 없는 메소드 선언(전원을 끄는 메소드)
    void powerOff(){
        System.out.println("전원을 끕니다.");
    }

    //호출 시 두 정수 값을 전달받고,
    //호출한 곳으로 결과값 int를 리턴하는 메소드 선언
    int plus(int a, int b){
        int result = a + b; // 전달받은 두 정수 a와 b를 더해서 result에 저장
        return result;       // result를 호출한 곳에 리턴
    }

    //호출 시 두 정수 값을 전달받고,
    //호출한 곳으로 결과값 double을 리턴하는 메소드 선언
    double divide(double a, double b){
        double result = (double) a / (double) b; // a를 b로 나눈 결과를 result에 저장
        return result; // result를 호출한 곳에 리턴

    }
}
