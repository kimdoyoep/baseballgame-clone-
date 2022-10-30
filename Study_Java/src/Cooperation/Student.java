package Cooperation;

public class Student {
    public String name; //학생 이름
    public int money; // 학생이 가진 돈

    //매개변수로 학생 이름, 가진 돈을 받는 생산자

    public Student(String name, int money){
        this.name = name;
        this.money = money;
    }

    //버스를 탄다
    public void takeBus(Bus bus){
        bus.take(1000);
        this.money -= 1000; // 버스요금 1000원 지불
    }

    public void takeSubway(Subway subway){
        subway.take(1200);
        this.money -= 1200;
    }

    public void takeTaxi(Taxi taxi){
        taxi.take(3800);
        this.money -= 3800;
    }

    public void showInfo(){
        System.out.println("남은 돈은 " + money + "입니다.");
    }

}
