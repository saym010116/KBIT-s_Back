package ch12.sec05;

public class StringBuilderExample {
    public static void main(String[] args) {
        String data =new StringBuilder()
                .append("DEF")
                .insert(0,"ABC")
                .delete(3,4)
                .toString();
        System.out.println(data);
    }
}
// String 클래스는 내부 문자열을 수정할 수 없다.
// StringBuilder 객체는 생성 후에도 내용을 변경할 수 있다.
// 1. append("DEF"): "DEF"를 추가합니다. → "DEF"
// 2. insert(0, "ABC"): 0번째 인덱스에 "ABC"를 삽입합니다. → "ABCDEF"
// 3. delete(3, 4): 3번째 인덱스부터 4번째 인덱스까지 삭제합니다. → "ABCEF"
// 4. toString(): StringBuilder를 String으로 변환합니다. → "ABCEF"