package advanced.java01;
// 심화문제
public class PrimitiveAndStringConversionExample {
    public static void main(String[] args) {
        int value1= Integer.parseInt("10"); // 문자열을 integer로 변환
        double value2= Double.parseDouble("3.14"); // 문자열을 double로 변환
        boolean value3= Boolean.parseBoolean("true"); //문자열을 boolean으로 변환

        System.out.println("value1= "+value1);
        System.out.println("value2= "+value2);
        System.out.println("value3= "+value3);

        String str1= String.valueOf(value1); // 기본타입의 값을 문자열로 변경
        String str2= String.valueOf(value2);
        String str3= String.valueOf(value3);

        System.out.println("str1= "+str1);
        System.out.println("str2= "+str2);
        System.out.println("str3= "+str3);
    }
}
