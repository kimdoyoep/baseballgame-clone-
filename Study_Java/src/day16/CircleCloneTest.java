package day16;

public class CircleCloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {

        Circle circle = new Circle(10, 20, 30);
        Circle copyCircle = (Circle)circle.clone();  //클론 메서드를 사용해 circle인스턴스를 copyCircle에 복제함.

        System.out.println(circle);
        System.out.println(copyCircle);
        System.out.println(System.identityHashCode(circle));
        System.out.println(System.identityHashCode(copyCircle));
    }
}
