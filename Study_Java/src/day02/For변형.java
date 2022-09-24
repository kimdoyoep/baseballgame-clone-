package day02;

public class For변형 {
    public static void main(String[] args) {
        int sum = 0;

        for(int a = 1; ;a++) {

            sum += a;
            if (sum <= 10) break;
        }
        System.out.println(sum);

    }
}
