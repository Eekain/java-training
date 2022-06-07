package java_advanced.schoolrecords;

import java.util.ArrayList;
import java.util.List;

public class Tutor {
    private String name;
    private List<Subject> taughtSubjects = new ArrayList<>();

    public Tutor(String name, List<Subject> subjects) {
        this.name = name;
        for(Subject s : subjects){
            taughtSubjects.add(s);
        }
    }

    public boolean tutorTeachingSubject(String subject){
        for(Subject s : taughtSubjects){
            if (s.getSubjectName().equals(subject)){
                return true;
            }
        }
        return false;

    }

    public String getName() {
        return name;
    }
}
