package ch03.sec10;

public class AssignmentOperatorExample {
    public static void main(String[] args) {
        int result =0;
        result += 10; // 우측 피연산자의 갑을 변수의 값과 더한 후에 다시 변수에 저장
        System.out.println("result="+result);
        result -= 5; // 우측 피연산자의 값을 변수의 값에서 뺀 후에 다시 변수에 저장
        System.out.println("result="+result);
        result *= 3; // 우측 피연산자의 값에 곱한 다음 다시 변수에 저장
        System.out.println("result="+result);
        result /= 5; // 우측 피연산자의 값에서 나눈다음 다시 변수에 저장
        System.out.println("result="+result);
        result %= 3; // 우측 피연산자의 값으로 나눈 후에 나머지를 변수에 저장
        System.out.println("result="+result);
    }
}
