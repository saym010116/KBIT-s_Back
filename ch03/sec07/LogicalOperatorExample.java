package ch03.sec07;

public class LogicalOperatorExample {
    public static void main(String[] args) {
        int charCode = 'A';
        // int charCode ='a';
        // int charCode = '5';

        if(65<=charCode && charCode<=90){ // 논리곱, 피연산자 모두가 true일 경우에만 연산 결과가 true
            System.out.println("대문자이군요.");
        }
        if(97<=charCode && charCode<=122){
            System.out.println("소문자이군요.");
        }
        if(48<=charCode && charCode<=57){
            System.out.println("숫자이군요.");
        }

        //-------------------------------------------

        int value = 6;
        //int value = 7;
        if((value%2==0)|(value%3==0)){
            System.out.println("2또는 3의 배수이군요.");
        }
        boolean result = (value % 2==0)||(value % 3==0); // ||:또는(OR,피연산자 중 하나만 true이면 연산결과는 true)
        if(!result){ // ! 논리부정
            System.out.println("2또는 3의 배수가 아니군요.");
        }

    }
}
