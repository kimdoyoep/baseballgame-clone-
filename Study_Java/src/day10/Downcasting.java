package day10;

import day09.Human;

import java.util.ArrayList;

public class Downcasting {

    class Animal {
        public void move(){
            System.out.println("사람이 두 발로 걷습니다.");
        }
    }

    public void readBook(){
        System.out.println("사람이 책을 읽습니다.");
    }

    class Tiger extends Animal {
        public void move(){
            System.out.println("호랑이가 네 발로 걷습니다.");
        }
        
        public void hunting(){
            System.out.println("호랑이가 사냥을 합니다.");
        }

    }

    class Eagle extends Animal{
        public void move(){
            System.out.println("독수리가 하늘을 납니다.");
        }
    }
}

public class AnimalTest {
    ArrayList<Animal> aniList = new ArrayList<Animal>();

    public static void main(String[] args) {
        AnimalTest aTest = new AnimalTest();
        aTest.addAnimal();
        System.out.println("원래 형으로 다운 캐스팅");
        aTest.testCasting();

    }

    public void addAnimal() {
        aniList.add(new Human());
        aniList.add(new Tiger());
        aniList.add(new Eagle());

        for(Animal ani : aniList)



}