package java_basic.office;

public class MeetingRoom {
    private String name;
    private Dimension dimension;

    public MeetingRoom(String name, int length, int width) {
        this.name = name;
        dimension = new Dimension(length, width);
    }

    public int getArea() {
        return dimension.getArea();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void elongate(int difference){

    }
}
