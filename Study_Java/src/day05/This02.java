package day05;

public class This02 {

    String name;
    int ge;

    person(){
        this("이름없음",1);
    }
    Person(String name, int age){
        this.name = name;
        this.age = age;

    }
}

public class CallAnotherConst{
    public static void main(String[] args) {
        Person noNaame = new Person();
        System.out.println(noNaame.name);
        System.out.println(noNaame.age);
    }
}