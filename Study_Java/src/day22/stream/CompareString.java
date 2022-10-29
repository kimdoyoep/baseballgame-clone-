package day22.stream;


import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String> {

    @Override
    public String apply(String s1, String s2){ //reduce 메서드가 호출될 때 불리는 메서드, 두 문자열 길이를 비교
        if(s1.getBytes().length >= s2.getBytes().length) return s1;
        else return s2;
    }
}

