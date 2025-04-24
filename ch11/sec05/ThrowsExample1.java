package ch11.sec05;

public class ThrowsExample1 {
    public static void main(String[] args) {
        try{
            findClass();
        }catch (ClassNotFoundException e){
            System.out.println("예외 처리: "+e.toString());
        }
    }
    public static void findClass() throws ClassNotFoundException {
        Class.forName("java.lang.String2");
    }
}
// throws
// 메소드 내부에서 예외가 발생할 때, 메소드를 호출한 곳으로 예외를 떠넘길 수 있다.
// 메소드 선언부 끝에 작성, 떠넘길 예외 클래스를 쉼표로 구분해서 나열
// findClass() 메서드는 이 예외를 던지기만 하고 처리하지 않으며, 예외를 throws 키워드를 사용하여 호출한 메서드로 전달함

// 흐름
// 1. main → findClass 호출.
// 2. findClass → "java.lang.String2" 클래스가 없어서 ClassNotFoundException 예외 발생.
// 3. findClass → throws로 예외를 main 메서드에 넘김.
// 4. main → try-catch로 예외를 처리.