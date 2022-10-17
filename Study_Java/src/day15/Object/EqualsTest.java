package day15.Object;

public class EqualsTest {

    public static void main(String[] args) {

        Equals studentLee = new Equals(100, "이상원");
        Equals studentLee2 = studentLee;
        Equals studentSang = new Equals(100, "이상원");

        if(studentLee == studentLee2)
            System.out.println("studentLee 와 studentLee2는 물리적으로 같습니다.");

        else
            System.out.println("studentLee 와 studentLee2는 물리적으로 다릅니다.");

        if(studentLee != studentSang)
            System.out.println("studentLee 와 studentSang은 물리적으로 다릅니다.");
        else
            System.out.println("studentLee 와 studentSang은 물리적으로 다를 수 밖에 없습니다.");

        if(studentLee2 != studentSang)
            System.out.println("studentLee2 와 studentSang은 물리적으로 다릅니다.");
        else
            System.out.println("studentLee2 와 studentSang은 물리적으로 다를 수 밖에 없습니다.");

        if(studentLee.equals(studentSang)) // 주소를 비교함 but 재정의를 통해 논리적으로 같은 인스턴스인지 확인하도록 구현 가능.
            System.out.println("studentLee 와 studentSang은 논리적으로 동일합니다");
        else
            System.out.println("studentLee 와 studentSang은 논리적으로 다릅니다.");







    }
}
