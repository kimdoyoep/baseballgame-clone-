package day02;

public class Switch {
    public static void main(String[] args) {

        int rank = 9;
        char medalcolor;

        switch (rank) {

            case 1:
                medalcolor = 'G';
                break;
            case 2:
                medalcolor = 'S';// 클린 코딩 단축기 ctrl + alt + L
                break;
            case 3:
                medalcolor = 'B';// sout 출력 단축기
                break;
            case 4:
                medalcolor = 'R';// main 소스(?) 단축기
                break;
            default:
                medalcolor = 'T';


        }
        System.out.println(rank + "순위메달은 " + medalcolor + "색입니다.");
    }
}
