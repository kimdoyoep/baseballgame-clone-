package day06;

public class Arraycopy {
    public static void main(String[] args) {

        int[] array1 = {10, 20, 30, 40, 50};
        int[] array2 = {1, 2, 3, 4, 5};

        System.arraycopy(array1, 0, array2, 1, 4);//(복사할 대상, 복사할 첫 위치, 대상 배열, 붙여 넣을 첫 위치, 보가할 요소 개수)
        for(int i = 0; i < array2.length; i++){
            System.out.println(array2[i]);//객체 배열 복사도 똑같이 하면 된다.
        }
    }
}
