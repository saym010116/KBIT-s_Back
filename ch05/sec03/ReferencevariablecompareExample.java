package ch05.sec03;

import java.util.Arrays;

public class ReferencevariablecompareExample {
    public static void main(String[] args) {
        int[] arr1;
        int[] arr2;
        int[] arr3;

        arr1 = new int[]{1,2,3}; // 새로운 int 배열을 만든 후 ,arr1이 그것을 가리킴(예: 주소A)
        arr2 = new int[]{1,2,3}; // 똑같이 생긴 배열이지만 새로운 배열 객체를 생성함(주소 B)
        arr3 = arr2; // arr3은 arr2가 가리키는 주소(주소B)를 그대로 복사해서 사용

        // 배열도 객체 이기 때문에 ==는 주소(참조) 비교
        System.out.println(arr1==arr2); // 결과: false
        System.out.println(arr2==arr3); // 결과: true

        //배열 값만 비교
        Arrays.equals(arr1,arr2); // 결과: true

    }
}
