package java_basic.noinheritance;

public class Attachment {
    private String name;

    public String getName() {
        return name;
    }

    public String getInfo(){
        return this.getName();
    }
}
