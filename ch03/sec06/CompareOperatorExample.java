package ch03.sec06;

public class CompareOperatorExample {
    public static void main(String[] args) {
        int num1 =10;
        int num2 =10;
        boolean result1 = (num1==num2);
        boolean result2 = (num1 !=num2);
        boolean result3 = (num1<=num2);
        System.out.println("result1: "+ result1);
        System.out.println("result2: "+ result2);
        System.out.println("result3: "+ result3);

        char char1= 'A';
        char char2= 'B';
        boolean result4 = (char1<char2);
        System.out.println("result4: "+ result4);

        int num3 =1;
        double num4 =1.0;
        boolean result5 = (num3==num4);
        System.out.println("result5: "+ result5);

        float num5 =0.1f;
        double num6 =0.1;
        boolean result6 = (num5==num6);
        boolean result7 =(num5==(float)num6);
        System.out.println("result6: "+ result6);
        System.out.println("result7: "+ result7);

        String str1 ="자바";
        String str2 ="Java";
        boolean result8 = (str1.equals(str2)); // 문자열 비교는 equals 사용해야함
        boolean result9 = (!str1.equals(str2)); // 참조 비교는 메모리주소 비교, equals는 값 자체 비교 why? a와 b는 내용은 같지만, new String()으로 각각 다른 메모리 공간에 만들어졌기 때문에, ==는 false가 나와요.
        System.out.println("result8: "+ result8); // +대소문자 구분 없이 비교하고 싶다면 equalsIgnoreCase()
        System.out.println("result9: "+ result9);
    }
}
