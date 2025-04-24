package ch04.sec05;
import java.util.Scanner;

public class KeyControlExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int speed =0;
        while(run) {
            System.out.println("-----------------------");
            System.out.println(" 1. 종속 | 2. 감속 | 3. 중지");
            System.out.println("-----------------------");
            System.out.print("선택: ");

            String setNum = scanner.nextLine();

//            if(setNum.equals("1")) {
//                speed++;
//                System.out.println("현재 속도= "+speed);
//            } else if (setNum.equals("2")) {
//                speed--;
//                System.out.println("현재 속도= "+speed);
//
//            } else if (setNum.equals("3")) {
//                run=false;
//
//            }

            //switch 문으로 해보기
            switch (setNum) {
                case "1":
                    speed++;
                    System.out.println("현재 속도= "+ speed);
                    break;
                case "2":
                    speed--;
                    System.out.println("현재 속도= "+ speed);
                    break;

                case "3":
                    run = false;
                    break;
            }
        }
        System.out.println("프로그램 종료");
    }
}
