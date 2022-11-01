package day23;

public class Casting {
    public static void main(String[] args) {

        double a = 1.1;
        double b = 1;
        System.out.println(b); //1.0

        // int c = 1.1; 정수 처리를 하면 0.1을 잃어버려서 오류가 뜸.
        int c = (int) 1.1; //강제로 정수로 바꾼다.


    }
}
