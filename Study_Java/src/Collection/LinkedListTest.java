package Collection;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList<String>();

        myList.add("A");
        myList.add("B");
        myList.add("C");

        System.out.println(myList); //myList 전체 출력

        myList.add(1, "D"); // myList 첫 번째 위치에 D 추가
        System.out.println(myList);

        myList.addFirst("0"); // 맨 앞에 0 추가
        System.out.println(myList);

        System.out.println(myList.removeLast());// 맨 뒤 요소 삭제 후 해당 요소를 출력
        System.out.println(myList);
    }

}
