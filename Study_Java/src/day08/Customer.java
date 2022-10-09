package day08;

public class Customer {
    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    int bonusPoint;
    double bonusRatio;

    public Customer() {
        customerGrade = "SILVER";
        bonusRatio = 0.01;
    }



    public Customer(int i, String 이순신) {
    }

    public int calcPrice(int price) { // calcPrice는 제품에 대해 지불해야 하는 금액을 계\산하여 반환합니다.
        bonusPoint += price * bonusRatio;
        return price;

    }

    public String showCustomerInfo() {
        return customerName + "님의 등급은" + customerGrade + "이며,보너스 포인트는" + bonusPoint + "입니다.";
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }


}
