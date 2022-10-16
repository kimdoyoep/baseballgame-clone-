package day14;

public class Customer implements Buy, Sell{

    @Override
    public void Sell(){
        System.out.println("판매하기");
    }

    @Override
    public void buy() {
        
    }

    @Override
    public void Buy(){
        System.out.println("구매하기");
    }

    public void sell() {
    }
}
