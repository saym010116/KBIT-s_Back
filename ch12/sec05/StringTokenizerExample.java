package ch12.sec05;

import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        String data1 = "홍길동&이수홍,박연수";
        String arr[] = data1.split("&|,");
        for (String token : arr) {
            System.out.println(token);
        }
        System.out.println();

        String data2 = "홍길동/이수홍/박연수";
        StringTokenizer st = new StringTokenizer(data2, "/");
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            System.out.println(token);
        }
    }
}
// split
// 정규 표현식으로 구분_(&),(,),(-)으로 구분될 경우 사용
// StringTokenizer
// 문자로 구분_한종류의 구분자만 있다면 사용 가능, 생략 시 공백이 기본 구분자