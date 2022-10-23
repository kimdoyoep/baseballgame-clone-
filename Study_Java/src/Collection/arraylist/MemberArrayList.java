package Collection.arraylist;

import java.util.ArrayList;
import Collection.Member;  // Member 클래스는 Collection 패키지에 있으므로 사용하려면 import 해야 함

public class MemberArrayList {

    private ArrayList<Member> arrayList; // ArrayList 선언

    public MemberArrayList(){
        arrayList = new ArrayList<Member>(); //Member 형으로 선언한 ArrayList 선언
    }

    public void addMember(Member member){
        arrayList.add(member); // ArrayList 에 회원을 추가하는 메서드
    }

    public boolean removeMember(int memberId){
        for(int i = 0; i < arrayList.size(); i++){
            Member member = arrayList.get(i); // get 메서드로 회원을 순차적으로 가져옴
            int tempId = member.getMemberId();
            if(tempId == memberId){ // 회원 아이디가 매개변수와 일치하면
                arrayList.remove(i);//해당 회원을 삭제
                return true;
            }
        }
        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }

    public void showAllMember(){
        for(Member member : arrayList){
            System.out.println(member);
        }
        System.out.println();
    }
}
