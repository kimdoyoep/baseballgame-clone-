package day15.Object;

public class EqualsTest {

    public static void main(String[] args) {

        Equals studentLee = new Equals(100, "이상원");
        Equals studentLee2 = studentLee;
        Equals studentSang = new Equals(100, "이상원");

        if(studentLee == studentLee2)
            System.out.println("studentLee 와 studentLee2는 같습니다.");

        else
            System.out.println("studentLee 와 studentLee2는 다릅니다.");







    }
}
