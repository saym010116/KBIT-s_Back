package advanced.java01;
import java.util.Scanner;
//심화 문제
public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("x 값 입력: ");
        String strX = scanner.next();
        int x = Integer.parseInt(strX);

        System.out.print("y 값 입력: ");
        String strY = scanner.next();
        int y = Integer.parseInt(strY);

        int result = x+y;
        System.out.println("x+y: "+result);
        System.out.println();
        // 무한 루프 코드
        while(true){
            System.out.print("입력 문자열: ");
            String data = scanner.nextLine();
            if(data.equals("q")){
                break;
            }
            System.out.println("출력 문자열: "+data);
            System.out.println();
        }
        System.out.println("종료");
    }
}
