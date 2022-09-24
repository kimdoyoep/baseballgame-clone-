package day02;

public class While {
    public static void main(String[] args) {

        int a = 1;
        int sum = 0;

        while (a <= 100) {

            sum += a;
            a++;

        }
        System.out.println("1부터 100까지 합은 " + sum + "입니다");

    }
}
