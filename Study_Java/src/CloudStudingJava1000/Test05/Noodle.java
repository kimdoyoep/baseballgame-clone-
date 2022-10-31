package CloudStudingJava1000.Test05;

public class Noodle {
    int money;

    int Count;

    public Noodle(int Count){
        this.Count = Count;
    }

    public void eat(int money){
        this.money += money;
    }

    public void showInfo(){
        System.out.println("칼국수" + " x " + Count + " = " + money*Count);
    }
}
