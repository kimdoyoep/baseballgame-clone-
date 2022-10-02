package day06;//싱글톤 연습

import javax.swing.*;

public class Company {
    private static Company instance = new Company();

    private Company() {

    }

    public static Company getInstance() {
        if (instance == null) {
            instance = new Company();
        }
        return instance;
    }
}
