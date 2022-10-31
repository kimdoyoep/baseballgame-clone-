package CloudStudingJava1000.Test05;

public class FoodTest {
    public static void main(String[] args) {

        Food food = new Food(30000);

        Fork fork = new Fork(16);
        food.eatFork(fork);
        fork.showInfo();

        Noodle noodle = new Noodle(8);
        food.eatNoodle(noodle);
        noodle.showInfo();

        MeatBun meatBun = new MeatBun(1);
        food.eatMeatBun(meatBun);
        meatBun.showInfo();


    }

}
