package CloudStudingJava1000.Test05;

public class Fork {
    String ForkName;
    int money;

    int Count;

    public Fork(int Count){
        this.Count = Count;
    }

    public void eat(int money){
        this.money += money;
    }

    public void showInfo(){
        System.out.println("돈가스" + " X " + Count + " = " + money*Count);
    }

}
