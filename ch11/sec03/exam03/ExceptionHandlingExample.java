package ch11.sec03.exam03;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        String[] array = {"100","1oo",null,"200"};

            for(int i=0;i<=array.length;i++) {
                try {
                    int value = Integer.parseInt(array[i]);
                    System.out.println("array[" + i + "] = " + value);
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("배열 인덱스가 초과됨: "+e.getMessage());

                } catch (NumberFormatException | NullPointerException e) {
                    System.out.println("데이터에 문제가 있음: "+e.getMessage());
                }
            }
    }
}
// 두개 이상의 예외를 하나의 catch 블록으로 동일하게 예외 처리 -> | 사용
// ArrayIndexOutOfBoundsException -> for문의 조건에서 인덱스 범위가 초과됨 0부터 array.length-1까지가 유효범위
// NumberFormatException -> "1oo"을 int로 변환할 수 없음
// NullPointerException -> 참조 변수가 null값 일때 메소드나 필드에 접근할 수 없음
