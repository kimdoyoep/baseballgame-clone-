package day05;

public class Hiding {
    int studentID;
    private String  studentName;
    int grade;
    String address;

    public String getStudentName(){
        return studentName;
    }

    public static void main(String studentName) {
        this.studentName = studentName;

    }
}
