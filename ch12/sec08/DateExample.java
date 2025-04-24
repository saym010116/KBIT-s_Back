package ch12.sec08;

import java.util.*;
import java.text.*;

public class DateExample {
    public static void main(String[] args) {
        Date now = new Date();
        String srtNow1 = now.toString();
        System.out.println(srtNow1);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String srtNow2 = sdf.format(now);
        System.out.println(srtNow2);
    }

}
// Date() ->컴퓨터의 현재 날짜를 읽어 Date 객체로 만든다.
// SimpleDateFormat 클래스와 함께 사용해서 원하는 문자열로 Date를 출력할 수 있다.
