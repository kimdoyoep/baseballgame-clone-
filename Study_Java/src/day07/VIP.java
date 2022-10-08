package day07;

public class VIP extends Customer { //Customer클래스 상속받음. 겹치는 기능을 다시 적지 않아서 편해짐

    private int agentID; //VIP상담원 아이디
    double saleRatio;//할인율

    public VIP(){
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;

    }

    public int getAgentId(){
        return agentID;
    }





}
