package day03;

public class Function03 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int sum = add(a, b);
        System.out.println(a + "+" + b + "=" + sum + "입니다.");

        System.out.println("");

        int c = 20;
        int d = 10;

        int sum2 = dvide(c, d);
        System.out.println(c + "/" + d + "=" + c / d + "입니다.");
    }

    public static int add(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

    public static int dvide(int num3, int num4) {
        int result = num3 / num4;
        return result;
    }


}



