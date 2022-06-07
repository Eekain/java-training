package java_advanced.schoolrecords;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public class ClassRecords {
    private String className;
    private Random random;
    private List<Student> students;

    public ClassRecords(String className) {
        this.className = className;
        this.random = new Random();
    }

    public boolean addStudent(Student stu){
        if(students.contains(stu)){
            return false;
        } else {
            students.add(stu);
        }
        return true;
    }
    public boolean removeStudent(String name){

        if(students.contains(findStudentByName(name))){
            students.remove(findStudentByName(name));
            return true;
        } else {
            return false;
        }
    }
    public double calculateClassAverage(){
        double res = 0;
        for(var s : students){
            res += s.calculateAverage();
        }
        res /= students.size();
        return res;

    }
    public double calculateClassAverageBySubject(Subject s){
        double res = 0;
        for(var st : students){
            res += st.calculateSubjectAverage(s);
        }
        res /= students.size();
        return res;
    }
    public Student findStudentByName(String name){
        for(Student s: students){
            if(s.getName().equals(name)){
                return s;
            }
        }
        //TODO: return Optional
        return null;
    }
    public Student repetition(){

        int randStudent = random.nextInt(students.size());

        return students.get(randStudent);
    }
    public List<StudentResultByName> listStudyResults(){
        var lsr = new ArrayList<StudentResultByName>();
        for(var s: students){
            lsr.add(new StudentResultByName(s.getName(), s.calculateAverage()));
        }
        return lsr;
    }
    public String listStudentNames(){
        String res = "";
        for(Student s: students){
            res += s.getName() + ",\n";
        }
        res = res.substring(0, res.length()-2);
        return res;
    }

    public String getClassName() {
        return className;
    }

    public List<Student> getStudents() {
        return students;
    }
}
