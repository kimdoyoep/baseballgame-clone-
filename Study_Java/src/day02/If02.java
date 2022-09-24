package day02;

public class If02 {
    public static void main(String[] args) {

        int age = 9;
        int charge;

        if (age < 7) {
            charge = 2000;
            System.out.println("취학 전 아동입니다");
        } else if (age < 14) {
            charge = 3000;
            System.out.println("초등학생입니다.");

        } else {
            charge = 40000;
            System.out.println("성인입니다");
        }
        System.out.println("입장료는" + charge + "원입니다");
    }

    ;
}
