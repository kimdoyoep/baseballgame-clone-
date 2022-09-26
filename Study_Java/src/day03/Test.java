package day03;

public class Test {
    public static void main(String[] args) {

        int a = 10;
        int b = 2;
        char c = '+';


        switch (c) {

            case '+':
                System.out.println(a + b);

                break;
            case '_':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '-':
                System.out.println(a / b);
            default:
                System.out.println("계산불가능");


        }

    }
}
