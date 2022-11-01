package CloudStudingJava1000;

public class Test08 {
    public static void main(String[] args) {

        int i = 994;
        int i2 = i%10;
        int i3 = i/100;
        int i4 = i%100;
        int i5 = i4/10;

        int result = i2+i3+i5;

        System.out.println(result);
    }
}
