package ch06.sec08.exam02;

public class ComputerExample {
    public static void main(String[] args) {
        Computer myCom = new Computer(); //Computer 객체 생성

        // sum 메소드 호출: 1, 2, 3을 인자로 전달
        int result1 = myCom.sum(1, 2, 3); // sum 메소드를 호출하여 1+2+3의 결과를 result1에 저장
        System.out.println("result1: " + result1);  // result1 값을 출력 -> 6

        // sum 메소드 호출: 1, 2, 3, 4, 5를 인자로 전달
        int result2 = myCom.sum(1, 2, 3, 4, 5); // sum 메소드를 호출하여 1+2+3+4+5의 결과를 result2에 저장
        System.out.println("result2: " + result2); // result2 값을 출력 -> 15

        // sum 메소드 호출: 배열을 인자로 전달
        int[] values = { 1, 2, 3, 4, 5 }; // 배열 values를 생성
        int result3 = myCom.sum(values); // 배열 values를 sum 메소드에 전달하여 합을 구하고 result3에 저장
        System.out.println("result3: " + result3); // result3 값을 출력 -> 15

        // sum 메소드 호출: 배열을 직접 인자로 전달
        int result4 = myCom.sum(new int[] { 1, 2, 3, 4, 5 });  // 배열을 직접 전달하여 합을 구함
        System.out.println("result4: " + result4); // result4 값을 출력 -> 15
    }
}
// 첫 번째 호출은 sum(1, 2, 3)으로 정수 3개를 전달하여 합을 구합니다.
// 두 번째 호출은 sum(1, 2, 3, 4, 5)로 정수 5개를 전달하여 합을 구합니다.
// 세 번째 호출은 배열을 이용한 호출로 int[] values = {1, 2, 3, 4, 5} 배열을 전달하여 합을 구합니다.
// 네 번째 호출은 배열을 직접 전달하여 sum(new int[]{1, 2, 3, 4, 5})로 합을 구합니다.
