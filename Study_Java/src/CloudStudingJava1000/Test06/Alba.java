package CloudStudingJava1000.Test06;

import java.util.Scanner;

public class Alba {
    public static void main(String[] args) {

        int Price;
        int time;

        Scanner sr = new Scanner(System.in);

        System.out.println("시급을 입력하세요");
        Price = sr.nextInt();

        System.out.println("일한 시간을 입력하세요");
        time = sr.nextInt();

        System.out.println(Price*time);


    }
}
