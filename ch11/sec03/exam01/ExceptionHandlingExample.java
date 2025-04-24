package ch11.sec03.exam01;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        String[] array = {"100", "1oo"};

        for (int i = 0; i <= array.length; i++) {
            try{
                int value = Integer.parseInt(array[i]);
                System.out.println("array[" + i + "] = " + value);
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("배열 인덱스가 초과됨: "+e.getMessage());
            }catch(NumberFormatException e){
                System.out.println("숫자로 변환할 수 없음:"+e.getMessage());
            }

        }
    }
}
// ArrayIndexOutOfBoundsException
// for 루프의 조건에서 i<=array.length로 작성되어 있음. but 배열의 인덱스는 0부터 시작하고, array.length-1까지 유효한 인덱스를 가짐.
// 배열의 인덱스 범위를 초과하였기 때문에 ArrayIndexOutOfBoundsException 예외 발생

// NumberFormatException
// "1oo"는 숫자로 변환할 수 없으므로 NumberFormatException 예외 발생