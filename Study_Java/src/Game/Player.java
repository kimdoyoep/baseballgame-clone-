package Game;

public class Player {

    private PlayerLevel level;

    public Player(){        // 처음 생성되면  BeginnerLevel로 시작하며 레벨 메시지 출력
        level = new BeginnerLevel();
        level.showLevelMessage();
    }

    public PlayerLevel getLevel(){
        return level;
    }

    public void upgradeLevel(PlayerLevel level){
        this.level = level;
        level.showLevelMessage();
    }

    public void play(int count){
        level.go(count);
    }


}
