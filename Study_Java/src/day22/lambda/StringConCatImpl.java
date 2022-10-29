package day22.lambda;

import day22.lambda.StringConcat;

public class StringConCatImpl implements StringConcat {
    
    @Override
    public void makeString(String s1, String s2){
        System.out.println(s1 + "," + s2);
    }
}
