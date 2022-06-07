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

    @Override
    public String toString() {
        return marktype.getDescription() +
                "(" + marktype.getValue()+")";
    }

    public MarkType getMarkType() {
        return marktype;
    }

    public Subject getSubject() {
        return subject;
    }

    public Tutor getTutor() {
        return tutor;
    }
    private void validate(MarkType markType, Subject subject, Tutor tutor){
        if(markType == null ){
            throw new NullPointerException("Mark type must not be null!");

        }
        if( subject == null || tutor == null){
            throw new NullPointerException("Both subject and tutor must be provided!");
        }
    }


}
