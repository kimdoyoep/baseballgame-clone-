package day08;

import day08.Customer;

public class VIP extends Customer { //Customer클래스 상속받음. 겹치는 기능을 다시 적지 않아서 편해짐

    private int agentID; //VIP상담원 아이디
    double saleRatio;//할인율

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio; //보너스 포인트 적립
        return price - (int)(price * saleRatio);  //할인된 가격을 계산하여 반환
    }

    public VIP(){
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;

    }
    public VIP(int i, String 김유신, int i2){

    }

    public int getAgentId(){
        return agentID;
    }





}
