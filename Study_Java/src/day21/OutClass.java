package day21;

public class OutClass {

    private int num = 10;
    private static int sNum = 20;

    static class InStaticClass {  // 정적 내부 클래스
        int inNum = 100;  // 정적 내부 클래스의 인스턴스 변수
        static int sINum = 200; // 정적 내부 클래스의 정적 변수


        void inTest(){  //정적 내부 클래스의 일반 메서드
            System.out.println("InStaticClass inNum = "+inNum+"(내부 클래스의 인스턴스 변수 사용)");
            System.out.println("InStaticClass SInNum ="+sINum+"(내부 클래스의 정적 변수 사용)");
            System.out.println("OutClass sNum ="+sNum+"(외부 클래스의 정적 변수 사용)");

        }

        static void sTest(){ //정적 내부 클래스의 정적 메서드
            System.out.println("InStaticClass SInNum ="+sINum+"(내부 클래스의 정적 변수 사용)");
            System.out.println("OutClass sNum ="+sNum+"(외부 클래스의 정적 변수 사용)");

        }
    }
}


