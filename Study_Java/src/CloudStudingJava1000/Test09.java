package CloudStudingJava1000;

import java.util.Scanner;

public class Test09 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // 중력 가속도
        double gravity = -9.81;
        // 떨어지는 시간
        double fallingTime = input.nextDouble();
        // 초기 높이
        double initialPosition = 1000.0;
        // x(t) = 0.5at^2 + v0t + x0
        double finalPosition = gravity*fallingTime;
        System.out.printf("%.2f 초 후, 물체의 고도는 %.2f m\n", fallingTime, finalPosition);

    }
}
