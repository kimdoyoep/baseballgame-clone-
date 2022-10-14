package day12.Game;

public class AdvanceLevel extends PlayerLevel {

    @Override
    public void run(){
        System.out.println("천천히 달립니다.");
    }

    @Override
    public void jump(){
        System.out.println("점프 합니다.");
    }

    @Override
    public void turn(){
        System.out.println("아직 스킬을 배우지 않았습니다.");
    }

    @Override
    public void showLevelMassage() {

    }

    @Override
    public void showLevelMessage(){
        System.out.println("***** 중급자 레벨입니다 *****");
    }
}
