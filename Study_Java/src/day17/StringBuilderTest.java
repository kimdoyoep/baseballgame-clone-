package day17;

public class StringBuilderTest { // StringBuffer,StringBuilder 은 문자열을 변경하거나 연결할 때 사용하면 좋음.
    // StringBuffer 은 문자열을 변경할 때 안전이 보장되고 StringBuilder 은 안전이 보장되지 않음(속도는 더 빠름).

    public static void main(String[] args) {

        String javaStr = new String("Java");
        System.out.println("javaStr 문자열 주소 :" + System.identityHashCode(javaStr));

        StringBuilder buffer = new StringBuilder(javaStr);
        System.out.println("연산 전 buffer 메모리 주소 :" + System.identityHashCode(buffer));

        buffer.append(" and");
        buffer.append(" android");
        buffer.append(" programing is fun!!!");
        System.out.println("연산 후 buffer 메모리 주소 :" + System.identityHashCode(buffer));

        javaStr = buffer.toString();
        System.out.println(javaStr);
        System.out.println("새로 만들어진 javaStr 문자열 주소 :" + System.identityHashCode(javaStr));


    }
}
