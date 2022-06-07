package java_advanced.schoolrecords;

public enum MarkType {
    A(5, "excellent"),
    B(4, "very good"),
    C(3, "improvement needed"),
    D(2, "close fail"),
    F(1, "fail");

    public final int value;
    public final String description;

    private MarkType(int value, String description) {
        this.value = value;
        this.description = description;
    }

    public int getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }
    public static MarkType findByValue(int value){
        for(var mt : MarkType.values()){
            if(mt.getValue() == value){
                return mt;
            }
        }
        throw new IllegalArgumentException("Cannot find mark with this value!");
    }
}
