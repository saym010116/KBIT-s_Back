package advanced.java02;

public class Num02_1 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++) { // 다섯줄 출력
            String star = "";
            for(int j=1;j<=i;j++) { // 각 줄마다 별을 필요한 개수만큼 꺼낸다
                star+="*";
            }
            System.out.println(star);
        }
    }
}
