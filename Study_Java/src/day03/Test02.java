package day03;

public class Test02 {
    public static void main(String[] args) {

        for (int i = 2; i < 10; i++) {
            for (int i2 = 2; i2 < 10; i2++){
                if(i%2!=0)
                    continue;{
                    System.out.println(i+"x"+i2+"="+i*i2);
                }
            }

        }
    }
}
