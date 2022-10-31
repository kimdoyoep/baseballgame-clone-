package CloudStudingJava1000.Test05;

public class MeatBun {
    int Count;
    int money;

    public MeatBun(int Count){
        this.Count = Count;
    }

    public void eat(int money){
        this.money += money;
    }

    public void showInfo(){
        System.out.println("만두" + " x " + Count + " = " + money*Count);
    }
}
