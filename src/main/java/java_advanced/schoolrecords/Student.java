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
            avg += m.getMarktype().mark;

        }
        avg /= marks.size();
        return avg;
    }
    public double calculateSubjectAverage(Subject subject){
        double res = 0;
        for(var m : marks){
            if(m.getSubject().equals(subject)){
                res += m.getMarktype().mark;
            }
        }
        res /= marks.size();
        return res;
    }

    public Student(String name, List<Mark> marks) {
        this.name = name;
        this.marks = marks;
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
