package day08;

import day08.Customer;
import day08.VIP;

public class CustomerTest1 extends Customer {


    public static void main(String[] args) {

        Customer customerlee = new Customer();
        customerlee.setCustomerID(10010);
        customerlee.setCustomerName("이순신");
        customerlee.bonusPoint = 1000;
        System.out.println(customerlee.showCustomerInfo());

        VIP customerKim = new VIP();
        customerKim.setCustomerID(10020);
        customerKim.setCustomerName("김유신");
        customerKim.bonusPoint = 10000;
        System.out.println(customerKim.showCustomerInfo());

    }
}
