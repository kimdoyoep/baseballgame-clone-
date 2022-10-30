package Cooperation;

public class StudentTest {
    public static void main(String[] args) {

        Student studentKim = new Student("김도엽", 30000);

        Bus Bus55 = new Bus(55);
        studentKim.takeBus(Bus55);
        Bus55.showInfo();

        Taxi taxiBS = new Taxi("부산택시");
        studentKim.takeTaxi(taxiBS);
        taxiBS.showInfo();

        Subway subwayBS = new Subway("부산지하철");
        studentKim.takeSubway(subwayBS);
        subwayBS.showInfo();


    }
}
