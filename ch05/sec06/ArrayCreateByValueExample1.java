package ch05.sec06;

public class ArrayCreateByValueExample1 {
    public static void main(String[] args) {
        String[] season = {"Spring", "Summer", "Autumn", "Winter"};


//        System.out.println("season[0]: "+season[0]);
//        System.out.println("season[1]: "+season[1]);
//        System.out.println("season[2]: "+season[2]);
//        System.out.println("season[3]: "+season[3]);
//        System.out.println();

        for (int i = 0; i < season.length; i++) {
            System.out.println("season[" + i + "]: "+ season[i]);
        }

        System.out.println();

        int[] scores = {83,90,87};
        int sum = 0;
        for(int i=0; i<scores.length; i++) {
            sum += scores[i];
        }
        System.out.println("총합: "+ sum);
        System.out.println("평균: " + (double) sum/scores.length);
        // double avg = (double) sum/3;
        // System.out.println("평균: "+ avg); ->결과값: 86.66666666666667


    }
}
