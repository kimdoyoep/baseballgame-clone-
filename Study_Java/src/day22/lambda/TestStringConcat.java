package day22.lambda;

import day22.lambda.StringConCatImpl;

public class TestStringConcat {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        StringConCatImpl concat1 = new StringConCatImpl();
        concat1.makeString(s1,s2);
    }
}
