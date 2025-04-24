package ch03.sec11;

public class ConditionalOperationExample {
    public static void main(String[] args) {
        int score = 85;
        char grade = (score>90)?'A':((score>80)?'B':'C');

        // 삼항 연산자(피연산자?피연산자:피연산자)
        // ?앞의 피연산자에 boolean 변수 또는 조건식이 옴
        // ?앞 값이 true이면 :앞의 피연산자 선택, 아니면 뒤의 연산자 선택
        // score이 90이상이면 grade에 A 대입, 아닐경우 score이 80이상이면 B, 그것도 아니면 C
        System.out.println(score+ "점은 "+grade+"등급입니다.");
    }
}
