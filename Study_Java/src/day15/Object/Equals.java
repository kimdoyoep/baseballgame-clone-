package day15.Object;

public class Equals {

    int studentId;
    String studentName;

    public Equals(int studentId, String studentName){
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public String toString(){
        return studentId + "," + studentName;
    }
}
