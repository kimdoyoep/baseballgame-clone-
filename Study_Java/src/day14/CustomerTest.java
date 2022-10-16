package day14;

public class CustomerTest {
    public static void main(String[] args) {

        Customer customer = new Customer();

        Buy buyer = customer;
        buyer.buy();

        Sell seller = customer;
        seller.Sell();

        if(seller instanceof Customer){
            Customer customer2 = (Customer)seller;
            customer2.buy();
            customer2.sell();
        }
    }
}
