package ch05.sec04;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        int[] intArray = null;
        intArray[0] = 10; // NullPointerException: 변수가 null인 상태에서 객체의 데이터나 메소드를 사용하려 할때 이 예외가 발생함.

        String str =null;
        System.out.println("총 문자수: "+str.length()); // NullPointerException
    }
}
