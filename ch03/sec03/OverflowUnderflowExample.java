package ch03.sec03;

public class OverflowUnderflowExample {
    public static void main(String[] args) {
        byte var1 =125;
        for(int i=0; i<5; i++){
            var1++;
            System.out.println("var1: "+ var1);
        } //byte 타입의 최댓값 127을 넘어가면 128이 되어 오버플로우 발생-> 연산 결과는 최소값인 -128이 됨.
        System.out.println("----------------------");

        byte var2= -125;
        for(int i=0; i<5; i++){
            var2--;
            System.out.println("var2: "+var2);
        } // byte 타입의 최솟값인 -128에서 -1을 빼면, 언더 플로우가 발생하여, 연산결과는 최대값인 127이 됨.


    }
}
