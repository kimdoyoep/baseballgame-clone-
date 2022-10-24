package Collection.treeSet;

import Collection.Member;

public class MemberTreeSetTest {
    public static void main(String[] args) {
        MemberTreeSet tree = new MemberTreeSet();

        Member memberPark = new Member(1003, "박수연");
        Member memberLee = new Member(1004, "이충고");
        Member memberSon = new Member(1005, "손흥민");

        tree.addMember(memberLee);
        tree.addMember(memberPark);
        tree.addMember(memberSon);
        tree.showAllMember();

        Member memberHong = new Member(1003, "홍길동");
        tree.addMember(memberHong);
        tree.showAllMember();

    }
}
