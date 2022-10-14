package day12.Game;

public class SuperLevel extends PlayerLevel {

    @Override
    public void run(){
        System.out.println("빨리 달립니다.");
    }

    @Override
    public void jump(){
        System.out.println("점프 합니다.");
    }

    @Override
    public void turn(){
        System.out.println("잽싸게 돕니다.");
    }

    @Override
    public void showLevelMassage() {
        System.out.println("***** 고급 레벨입니다 *****");
    }

    @Override
    public void showLevelMessage() {

    }


}
