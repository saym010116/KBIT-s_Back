package ch15.sec03.exam01;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();

        //객체 저장
        set.add("Java");
        set.add("JDBC");
        set.add("Servlet/JSP");
        set.add("Java");
        set.add("iBATIS");

        //저장된 객체 수 출력
        int size = set.size();
        System.out.println("총 객체 수: "+ size);
    }
}
// 총 객체 수: 4
// 문자열을 HashSet에 저장할 경우, 같은 문자열을 갖는 String 객체는 동등한 객체로 간주한다.
// 같은 문자열이면 hashCode()의 리턴값이 같고 equals()의 리턴값이 true가 나오기 때문이다.