package advanced.java01;
// 심화문제
public class PrintfExample {
    // println(내용); 괄호안의 내용을 출력하고 행을 바꿔라.
    // print(내용); 괄호 안의 내용을 출력해라.(행 바꿈X)
    // printf("형식문자열", 값1, 값2,...); 형식문자열에 맞추어 뒤의 값을 출력해라
    // 타입: %(필수)d(정수) %s(문자열), %f(실수)
    // 형식 문자열에 포함될 값이 두개 이상일 경우에는 순번; 1$(첫번째)
    // 공백: %-2타입 -> 2자리 타입, 오른쪽 빈자리 공백, %2타입 2자리 타입, 왼쪽빈자리 공백
    // 소숫점: %10.2f -> 총 10자리 중 소수점 아래는 2자리, 나머지는 정수와 공백으로 채워라, 왼쪽빈자리 공백
    // 0채움: %010.2f -> 총 10자리 중 소수점 아래는 2자리, 나머지는 정수와 공백으로 채워라,왼쪽빈자리 0으로 채움
    public static void main(String[] args) {
        int value =123;
        System.out.printf("상품의 가격:%d원\n", value); // 정수여서 d사용
        System.out.printf("상품의 가격:%6d원\n",value); // 6자리 정수, 왼쪽 빈자리
        System.out.printf("상품의 가격:%-6d원\n",value); // 6 자리 정수, 오른쪽 빈자리
        System.out.printf("상품의 가격:%06d원\n",value); // 6자리 정수 왼쪽 빈자리 0으로 채움

        double area =3.14159*10*10;
        System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n",10,area);

        String name="홍길동";
        String job="도적";
        System.out.printf("%6d | %-10s | %10s\n",1,name,job);


    }
}
