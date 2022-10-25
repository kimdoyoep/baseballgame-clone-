package Map.hashmap;

import Collection.Member;

public class MemberHashMapTest {
    public static void main(String[] args) {
        MemberHashMap hs = new MemberHashMap();

        Member memberLee = new Member(1001, "이해문");
        Member memberSon = new Member(1002, "손흥민");
        Member memberKim = new Member(1003, "김준호");
        Member memberPark = new Member(1004, "박수연");

        hs.addMember(memberKim);
        hs.addMember(memberLee);
        hs.addMember(memberSon);
        hs.addMember(memberPark);

        hs.showAllMember();

        hs.removeMember(1004);
        hs.showAllMember();
    }
}
