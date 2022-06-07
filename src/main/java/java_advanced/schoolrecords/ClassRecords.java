package java_advanced.schoolrecords;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClassRecords {
    private String className;
    private Random random;
    private List<Student> students = new ArrayList<>();

    public ClassRecords(String className, Random r) {
        this.className = className;
        this.random = r;
    }

    public boolean addStudent(Student stu) {
        if (getStudentByNameOrNull(stu.getName()) != null) {
            return false;
        } else {
            students.add(stu);
        }
        return true;
    }

    public boolean removeStudent(Student stu) {
        Student foundStudent = getStudentByNameOrNull(stu.getName());
        if (foundStudent != null) {
            students.remove(foundStudent);
            return true;
        } else {
            return false;
        }
    }

    public double calculateClassAverage() {
        validateStudents();
        double res = 0;
        if (students.size() == 0) {
            throw new ArithmeticException("No marks present, average calculation aborted!");
        } else {
            for (var s : students) {
                if (s.calculateAverage() != 0) {
                    res += s.calculateAverage();
                }

            }
            res /= students.size();
        }

        return Math.round(100 * res) / 100;

    }

    public double calculateClassAverageBySubject(Subject s) {
        validateStudents();
        double res = 0;
        if (students.size() == 0) {
            throw new ArithmeticException("No marks present, average calculation aborted!");
        } else {
            for (var st : students) {
                if (st.calculateSubjectAverage(s) != 0) {
                    res += st.calculateSubjectAverage(s);
                }

            }
            res /= students.size();
        }

        return Math.round(100 * res) / 100;
    }

    public Student findStudentByName(String name) {
        validateStudentsAndName(name);
        Student student = getStudentByNameOrNull(name);
        if (student == null) {
            throw new IllegalArgumentException("Student by this name cannot be found! " + name);
        }
        return student;
    }

    public Student repetition() {

        if (students.isEmpty()) {
            throw new IllegalStateException("No students to select for repetition!");
        }
        return students.get(random.nextInt(students.size()));
    }

    private Student getStudentByNameOrNull(String name) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        return null;
    }

    public List<StudyResultByName> listStudyResults() {
        var lsr = new ArrayList<StudyResultByName>();
        for (var s : students) {
            lsr.add(new StudyResultByName(s.getName(), s.calculateAverage()));
        }
        return lsr;
    }

    public List<String> listStudentNames() {
        List<String> names = new ArrayList<>();
        for (Student student : students) {
            names.add(student.getName());
        }
        return names;
    }

    public String getClassName() {
        return className;
    }

    public List<Student> getStudents() {
        return students;
    }

    private boolean isEmpty(String str) {
        return str == null || "".equals(str.trim());
    }

    private void validateStudents() {
        if (students.isEmpty()) {
            throw new ArithmeticException("No student in the class, average calculation aborted!");
        }
    }

    private void validateStudentsAndName(String name) {
        if (students.isEmpty()) {
            throw new IllegalStateException("No students to search!");
        }
        if (isEmpty(name)) {
            throw new IllegalArgumentException("Student name must not be empty!");
        }
    }
}
