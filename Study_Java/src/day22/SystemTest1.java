package day22;

import java.io.IOException;

public class SystemTest1 {
    public static void main(String[] args) {
        System.out.println("알파벳 하나르 고르고 [Enter]를 누르세요.");

        int i;
        try {
            i = System.in.read(); //read 메서드로 한 바이트 읽음
            System.out.println((char)i);
        } catch(IOException e){ // 문자로 반환하여 출력

            e.printStackTrace();
        }

    }

}
