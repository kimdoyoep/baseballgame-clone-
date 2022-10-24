package Collection.hashset;

import Collection.Member;

public class HashSetTest {
    public static void main(String[] args) {
        MemberHashSet hash = new MemberHashSet();

        Member memberLee = new Member(1001, "이충고");
        Member memberSon = new Member(1002, "손흥민");
        Member memberPark = new Member(1003, "박수연");

        hash.addMember(memberLee);
        hash.addMember(memberSon);
        hash.addMember(memberPark);
        hash.showAllMember();

        Member memberHong = new Member(1003, "홍길동");//아이디 중복 회원 추가
        hash.addMember(memberHong);
        hash.showAllMember();


    }
}
