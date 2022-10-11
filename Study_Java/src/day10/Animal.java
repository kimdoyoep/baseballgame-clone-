package day10;


public class Animal {

    public void move() {
        System.out.println("동물이 움직입니다.");

    }

}

class Human extends Animal {
    public void move(){
        System.out.println("사람이 두 발로 걷습니다.");
    }

    public void readBook() {
    }
}

class Tiger extends  Animal{
    public void move(){
        System.out.println("호랑이가 네 발로 걷습니다");

        }
}

class Eagle extends Animal{
    public void move(){
        System.out.println("독수리가 하늘을 납니다.");

    }

}

