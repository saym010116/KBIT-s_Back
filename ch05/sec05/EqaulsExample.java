package ch05.sec05;

public class EqaulsExample {
    public static void main(String[] args) {
        String strVar1 = "홍길동";  //리터럴로 만든 문자열은 공용 메모리 공간에 저장되기 때문에 같은 리터럴을 사용하면 이미있는 주소를 재사용함
        String strVar2 = "홍길동";
        // ==으로 두 변수 비교
        if (strVar1 == strVar2) {
            System.out.println("strVar1과 strVar2는 참조가 같음");
        }else{
            System.out.println("strVar1과 strVar2는 참조가 다름");
        }
       // 내용으로 두 변수 비교
        if (strVar1.equals(strVar2)) {
            System.out.println("strVar1과 strVar2는 문자열이 같음");
        }else{
            System.out.println("strVar1과 strVar2는 문자열이 다름");
        }

        String strVar3 = new String("홍길동"); // new를 사용하면 Heap영역에 새로운 객체를 만듦 -> 내용이 같더라도 주소가 다름
        String strVar4 = new String("홍길동"); // Heap영역: new로 만든 객체들이 저장되는 공간
        if (strVar3 == strVar4) {
            System.out.println("strVar3과 strVar4는 참조가 같음");
        }else{
            System.out.println("strVar3과 strVar4는 참조가 다름");
        }
        // 내용으로 두 변수 비교
        if (strVar3.equals(strVar4)) {
            System.out.println("strVar3과 strVar4는 문자열이 같음");
        }else{
            System.out.println("strVar3과 strVar4는 문자열이 다름");
        }
    }
}
