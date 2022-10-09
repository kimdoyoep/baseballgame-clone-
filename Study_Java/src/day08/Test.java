package day08;

public class Test {

    int num;
    void aaa(){
        System.out.println("aaa()출력");

    }

    public static void main(String[] args) {
        Test a = new Test();
        a.aaa();
        Test b = new Test();
        b.aaa();
    }

}
