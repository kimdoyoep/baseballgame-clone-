package day05;

public class This {

    int dat;
    int month;
    int year;

    public void setYear(int year){
        this.year = year;
    }
    public void printThis(){
        System.out.println(this);
    }
}

public class ThisExample(){
    public static void main(String[] args) {
        Birthdat bDay = new Birthday();
        bDay.setyear(2000);
        System.out.println(bDay);
        bDay.printThis();
    }
}
