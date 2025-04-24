package ch06.sec08.exam01;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator myCalc = new Calculator(); //Calculator 객체 생성
        myCalc.powerOn(); //리턴값이 없는 powerOn() 메소드 호출

        // plus 메소드 호출 (두 정수의 합을 구함)
        int result1 = myCalc.plus(5, 6); // 5와 6을 전달하여 더한 결과를 result1에 저장
        System.out.println("result1: " + result1); // result1의 값을 출력 -> 11

        // 두 정수 값을 설정
        int a = 10;
        int b = 4;

        // divide 메소드 호출 (두 정수의 나눗셈을 수행)
        double result2 = myCalc.divide(a, b);  // a를 b로 나눈 값을 result2에 저장
        System.out.println("result2: " + result2); // result2의 값을 출력 -> 2.5

        // powerOff 메소드 호출 (전원을 끔)
        myCalc.powerOff(); // powerOff() 메소드 호출 -> "전원을 끕니다." 출력
    }
}