package ch05.sec08;

public class ArrayReferenceObjectExample {
    public static void main(String[] args) {
        String[] stArray = new String[3];
        stArray[0] = "Java";
        stArray[1] = "Java";
        stArray[2] = new String("Java");

        System.out.println(stArray[0]==stArray[1]); // true
        System.out.println(stArray[0]==stArray[2]); // false 객체 새로 생성한거라 다름
        System.out.println(stArray[0].equals(stArray[2])); // true 내용은 같음
    }
}
