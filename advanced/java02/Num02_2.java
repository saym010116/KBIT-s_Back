package advanced.java02;

public class Num02_2 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++) {
            String star ="";
            for(int j=5;j>=i;j--) {
                star +="*";
            }
            System.out.println(star);
        }

    }
}
