package day09;

public class Gold extends Customer {
    double saleRatio;

    public Gold(int customerID, String customerName) {
        super(customerID, customerName);
        customerGrade = "Gold";
        bonusRatio = 0.02;
        saleRatio = 0.1;
    }

    public int calcPrice(int price) {        //재정의한 메서드
        bonusPoint += price * bonusRatio;
        return price - (int) (price * saleRatio);
    }
}
