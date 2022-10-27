package day21;

public class InnerTest {
        public static void main(String[] args) {
            OutClass.InStaticClass sInClass = new OutClass.InStaticClass(); //외부 클래스를 생성하지 않고 바로 정적 내부 클래스 생성 가능
            System.out.println("정적 내부 클래스 일반 메서드 호출");
            sInClass.inTest();
            System.out.println();
            System.out.println("정적 내부 클래스의 정적 메서드 호출");
            OutClass.InStaticClass.sTest();
        }

    }
