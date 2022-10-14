package day13;

public interface Calc {

    double PI = 3.14; // 인터페이스에서 선언한 변수는 상수로 변함.
    int ERROR = -99999999;

    int add(int num1, int num2); // 인터페이스에서 선언한 메서드는 추상 메서드로 변함.
    int substract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);

}
