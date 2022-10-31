package CloudStudingJava1000;

import java.util.Scanner;


public class Test07 {
    public static void main(String[] args) {

        int euroHJ = 1100;
        int dollarHJ = 1300;

        Scanner sr = new Scanner(System.in);

        System.out.println("유로 :");
        int euro = sr.nextInt();

        System.out.println("달러 :");
        int dollar = sr.nextInt();

        System.out.println(euro + "유로 " + "+ " + dollar + "달러 =" + (euroHJ*euro+dollar*dollarHJ));



    }
}
