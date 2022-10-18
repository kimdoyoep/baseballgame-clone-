package day16;

public class StringTest2 {
    public static void main(String[] args) {

        String javaStr = new String("java");
        String androidStr = new String("android");

        System.out.println(javaStr);
        System.out.println("처음 문자열 주소 값 :" + System.identityHashCode(javaStr));

        javaStr = javaStr.concat(androidStr); // 두 문자열을 연결하는 concat 메서드 사용

        System.out.println(javaStr);
        System.out.println("연결된 문자열 주소 값 :" + System.identityHashCode(javaStr));
    }
}
