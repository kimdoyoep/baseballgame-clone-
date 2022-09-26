package day03;

public class Function02 {
    void divide(int num1, int num2) {

        if (num1 == 0) {
            System.out.println("나누는 수는 0될 수 없습니다.");
            return;
        } else {
            int result = num1 / num2;
            System.out.println(num1 + "/" + num2 + "=" + num1 / num2);

        }
    }
}
