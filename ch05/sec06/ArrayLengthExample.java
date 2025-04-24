package ch05.sec06;

public class ArrayLengthExample {
    public static void main(String[] args) {
        int[] array = new int[]{84,90,96};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("총합: "+ sum);
        System.out.println("평균: "+(double) sum / array.length);
        // System.out.printf("평균: %.1f\n",(double) sum / array.length);

    }
}
