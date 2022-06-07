package java_advanced.schoolrecords;

public class Mark {
    private MarkType marktype;
    private Subject subject;
    private Tutor tutor;

    public Mark(MarkType marktype, Subject subject, Tutor tutor) {
        this.marktype = marktype;
        this.subject = subject;
        this.tutor = tutor;
    }
    public Mark(String marktype, Subject subject, Tutor tutor) {
        this.marktype = MarkType.valueOf(marktype);
        this.subject = subject;
        this.tutor = tutor;
    }

    @Override
    public String toString() {
        return "Mark{" +
                "marktype=" + marktype +
                ", subject=" + subject +
                ", tutor=" + tutor +
                '}';
    }

    public MarkType getMarktype() {
        return marktype;
    }

    public Subject getSubject() {
        return subject;
    }

    public Tutor getTutor() {
        return tutor;
    }
}
