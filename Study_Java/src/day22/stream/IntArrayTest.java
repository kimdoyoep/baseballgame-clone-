package day22.stream;

import java.util.Arrays;

public class IntArrayTest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int sumVal = Arrays.stream(arr).sum(); // sum 연산으로 arr 배열에 저장된 값을 모두 더함
        int count = (int)Arrays.stream(arr).count();// count 연산으로 arr 배열의 요소 개수를 반환함

        System.out.println(sumVal);
        System.out.println(count);
    }
}
