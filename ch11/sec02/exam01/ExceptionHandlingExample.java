package ch11.sec02.exam01;
// 1번
//public class ExceptionHandlingExample {
//    public static void printLength(String data) {
//        int result = data.length();
//        System.out.println("문자 수: "+ result);
//    }
//    public static void main(String[] args){
//        System.out.println("[프로그램 시작]\n");
//        printLength("ThisIsJava");
//        printLength(null);
//        System.out.println("[프로그램 종료]");
//    }
//}
// data가 null일 경우 NullPointerException이 발생한다.
// 참조 변수가 null인 상태에서 필드나 메소드에 접근할 경우 발생

// 2번
//예외 처리코드 추가
public class ExceptionHandlingExample {
    public static void printLength(String data) {
        try{
            int result = data.length();
            System.out.println("문자 수: " + result);
        }catch(NullPointerException e) {
            System.out.println(e.getMessage());
            // System.out.println(e.toString); -> 예외의 종류도 함께 return
            // e.printStackTrace(); -> 예외가 어디서 발생했는지 추적한 내용도 출력 해줌.
        }finally {
            System.out.println("[마무리 실행]\n");
        }

    }

    public static void main(String[] args) {
        System.out.println("[프로그램 시작]\n");
        printLength("ThisIsJava");
        printLength(null);
        System.out.println("[프로그램 종료]");
    }
}