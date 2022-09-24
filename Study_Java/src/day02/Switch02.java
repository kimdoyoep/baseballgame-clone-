package day02;

public class Switch02 {
    public static void main(String[] args) {

        int floor = 5;
        String tkdrk;

        switch (floor) {

            case 1:
                tkdrk = "약국";
                break;
            case 2:
                tkdrk = "정형외과";
                break;
            case 3:
                tkdrk = "피부과";
                break;
            case 4:
                tkdrk = "치과";
                break;
            default:
                tkdrk = "헬스 클럽";

        }

        System.out.println(floor + "층 " + tkdrk + "입니다.");

    }
}
