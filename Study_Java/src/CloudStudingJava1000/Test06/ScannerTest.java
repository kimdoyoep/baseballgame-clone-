package CloudStudingJava1000.Test06;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {

        String intro;
        String buffer;

        Scanner sc = new Scanner(System.in);

        System.out.println("자기소를 입력하세요");
        intro = sc.nextLine();


        System.out.println(intro);
    }
}
