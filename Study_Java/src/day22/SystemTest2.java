package day22;

import java.io.IOException;

public class SystemTest2 {
    public static void main(String[] args) {
        System.out.println("알파펫 여러 개를 쓰고 [Enter]를 누루세요.");

        int i;
        try{
            while((i = System.in.read()) != '\n'){
                System.out.println((char)i);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
