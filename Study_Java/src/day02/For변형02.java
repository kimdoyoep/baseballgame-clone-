package day02;

public class For변형02 {
    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {
            for (int n = 1; n < 10; n++) {
                System.out.println(i + "x" + n + "=" + i * n);
            }
            System.out.println();
        }

    }
}
