package Collection.arraylist;

import java.util.ArrayList;

public class MyStack {
    private ArrayList<String> arrayStack = new ArrayList<String>();

    public void push(String data){ // 스택의 맨 두에 요소를 추가
        arrayStack.add(data);
    }

    public String pop(){
        int len = arrayStack.size();
        if(len == 0){
            System.out.println("스택이 비었습니다.");
            return null;
        }

        return(arrayStack.remove(len - 1));
    }
}


