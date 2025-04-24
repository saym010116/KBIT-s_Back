package ch05.sec05;

public class CharAtExample {
    public static void main(String[] args) {
        String ssn = "9506242230123";
        char sex = ssn.charAt(6);
        switch(sex){
            case '1':
            case '3':
                System.out.println("남자입니다.");
                break;
            case '2':
            case '4':
                System.out.println("여자입니다.");
                break;
        }
//        // 삼항연산자로 풀어보기
//        String result=(sex=='1'||sex=='3')? "남자입니다.":"여자입니다."; // 1이나 3이 아닐경우 다 "여자입니다."가 출력됨, 예외처리가 불가능
//        System.out.println(result);


    }
}
