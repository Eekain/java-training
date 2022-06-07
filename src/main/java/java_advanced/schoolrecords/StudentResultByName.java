package java_advanced.schoolrecords;

public class StudentResultByName {
    private String studentName;
    private double average;

    public StudentResultByName(String studentName, double average) {
        this.studentName = studentName;
        this.average = average;
    }

    public String getStudentName() {
        return studentName;
    }

    public double getAverage() {
        return average;
    }
}
