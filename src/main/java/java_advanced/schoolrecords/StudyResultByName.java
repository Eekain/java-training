package java_advanced.schoolrecords;

public class StudyResultByName {
    private String studentName;
    private double average;

    public StudyResultByName(String studentName, double average) {
        this.studentName = studentName;
        this.average = average;
    }

    public String getStudentName() {
        return studentName;
    }

    public double getStudyAverage() {
        return average;
    }
}
