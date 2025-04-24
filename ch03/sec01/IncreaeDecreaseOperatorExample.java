package ch03.sec01;

public class IncreaeDecreaseOperatorExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z;

        x++; // ++는 변수의 값을 1증가시키는 연산자 x = 10+1
        ++x; // 변수 앞 뒤에 붙어도 결과는 동일하다. x = (10+1)+1
        System.out.println("x="+x); // x=12

        System.out.println("--------------------------");

        y--; // --는 변수의 값을 1감소시키는 연산자 y=10-1
        --y; // 변수 앞 뒤에 붙어도 결과는 동일하다. y=(10-1)-1
        System.out.println("y="+y); // y=8
        System.out.println("---------------------------");

        z=x++; // x값을 먼저 z에 넣고, 그 다음 x를 1을 증가
        System.out.println("z="+z); // z=12
        System.out.println("x="+x); // x=13

        System.out.println("----------------------------");

        // 대입문 안에서 ++x와 x++는 다르다
        // z = x++; x 값을 먼저 z에 주고, x는 나중에 증가; z = x, x = x + 1;
        // z = ++x; x를 먼저 증가시키고, 그걸 z에 넣음; 	x = x + 1, z = x;
        z=++x;
        System.out.println("z="+z); // z=14
        System.out.println("x="+x); // x=14

        System.out.println("----------------------------");

        z = ++x + y++; // x=15 ,y=9
        System.out.println("z="+z);
        System.out.println("x="+x);
        System.out.println("y="+y);
    }
}
