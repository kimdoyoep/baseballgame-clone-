package CloudStudingJava1000.Test05;

public class Food {

    int money;


    public Food(int money) {
        this.money = money;
    }

    public void eatFork(Fork fork) {
        fork.eat(8000);
        this.money -= money;
    }

    public void eatNoodle(Noodle noodle) {
        noodle.eat(6000);
        this.money -= money;
    }

    public void eatMeatBun(MeatBun meatBun) {
        meatBun.eat(5000);
        this.money -= money;
    }

    public void showInfo(){
        System.out.println("총합 : " );
    }



}
