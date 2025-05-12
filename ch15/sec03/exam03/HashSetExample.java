package ch15.sec03.exam03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        // HashSet 컬렉션 생성
        // HashSet은 중복은 허용하지 않고, 저장 순서를 보장하지 않는 자료구조
        Set<String> set = new HashSet<String>();

        // 객체 추가
        set.add("Java");
        set.add("JDBC");
        set.add("JSP");
        set.add("Spring");

        // Iterator 패턴으로 순회하며 각 요소를 출력하세요
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) { // Iterator을 사용하여 Set을 순회, hasNext()는 다음 요소가 있는지 확인, next()는 요소를 하나씩 꺼냄
            // 객체를 하나 가져오기
            String element = iterator.next();
            System.out.println(element);
            if(element.equals("JSP")){
                // 가져온 객체를 컬렉션에서 제거
                iterator.remove(); // Set을 순회 중에 set.remove()를 직접 호출하면 ConcurrentModificationException이 발생할 수 있음 but. iterator.remove()는 안전하게 제거 가능
            }
        }
        System.out.println();
        // 객체 제거
        set.remove("JDBC");
        // 향상된 for 문으로 순회하며 각 요소를 출력하세요.
        for (String element : set) {
            System.out.println(element);
        }
    }
}
