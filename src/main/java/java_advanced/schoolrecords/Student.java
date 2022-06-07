package java_advanced.schoolrecords;

import java.util.List;

public class Student {
    private String name;
    private List<Mark> marks;
    public void grading(Mark mark){

        marks.add(mark);
    }
    public double calculateAverage(){
        double avg = 0;
        for(Mark m : marks){
            avg += m.getMarkType().value;

        }
        avg /= marks.size();
        return avg;
    }
    public double calculateSubjectAverage(Subject subject){
        double res = 0;
        for(var m : marks){
            if(m.getSubject().equals(subject)){
                res += m.getMarkType().value;
            }
        }
        res /= marks.size();
        return res;
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Mark> getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
