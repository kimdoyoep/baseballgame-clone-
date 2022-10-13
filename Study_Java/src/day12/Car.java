package day12;

public abstract class Car {

    public abstract void drive();
    public abstract void stop();

    public void startCar(){
        System.out.println("시동을 켭니다.");
    }

    public void turnOffCar(){
        System.out.println("시동을 끕니다.");
    }

    final public void run(){ //템플릿 메서드
        startCar();
        drive();
        stop();
        turnOffCar();
    }


}
