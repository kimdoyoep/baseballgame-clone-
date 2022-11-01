package day23;

public class Datatype {
    public static void main(String[] args) {
        System.out.println(6); //Number
        System.out.println("six"); //String
        System.out.println("6"); //String 6 사람이 읽을 때는 같지만 컴퓨터는 다르게 받아들임.

        System.out.println(6+6); //12
        System.out.println("6" + "6"); //66

        System.out.println(6*6); //36
        System.out.println("1111".length()); //4 문자열의 길이를 알려줌.
        // System.out.println(1111.lenght()); 숫자의 길이를 알려주는 것은 없다 -> 에러뜸.
        System.out.println("안녕하세요".length()); // 5

    }
}
