package day22;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("이름 : "); //문자열을 읽는 nextLine 메서드로 이름과 직업 입력받음
        String name = scanner.nextLine();
        System.out.println("직업 : ");
        String job = scanner.nextLine();
        System.out.println("사변 : "); //int 형을 읽는 nextInt 메서드로 사변을 입력받음
        int num = scanner.nextInt();

        System.out.println(name);
        System.out.println(job);
        System.out.println(num);
    }
}
