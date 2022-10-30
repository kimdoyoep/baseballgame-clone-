package Cooperation;

public class Bus {
    int BusNumber;
    int passengerCount;
    int money;

    public Bus(int BusNumber) {
        this.BusNumber = BusNumber;
    }

    public void take(int money) {
        this.money += money; //버스요금 (매개변수 money)만큼 버스 수입이 증가
        passengerCount++;
    }

    public void showInfo() {
        System.out.println("버스 " + BusNumber + "번의 승객은 " + passengerCount + "명이고, 수입은 " + money + "입니다.");
    }
}
