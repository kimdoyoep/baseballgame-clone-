package Collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

import Collection.Member;

public class MemberHashSet {
    private HashSet<Member> hashSet; // HashSet선언

    public MemberHashSet(){
        hashSet = new HashSet<Member>();
    }

    public void addMember(Member member){
        hashSet.add(member);
    }

    public boolean removeMember(int memberId){
        Iterator<Member> ir = hashSet.iterator();

        while(ir.hasNext()){
            Member member = ir.next();// 회원을 하나씩 가져와서
            int tempId = member.getMemberId();//아이디 비교
            if(tempId == memberId){ // 같은 아이디인 경우
                hashSet.remove(member);// 회원 삭제
                return true;

            }
        }

        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }

    public void showAllMember(){
        for(Member member : hashSet){
            System.out.println(member);
        }
        System.out.println();
                
    }

}
