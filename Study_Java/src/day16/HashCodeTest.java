package day16;

public class HashCodeTest {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1.hashCode());// 해시 코드 값 출력
        System.out.println(str2.hashCode());

        Integer i1 = new Integer(1);
        Integer i2 = new Integer(1);

        System.out.println(i1.hashCode());
        System.out.println(i2.hashCode());

        System.out.println(i1.equals(i2));


    }
}
