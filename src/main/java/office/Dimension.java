package office;

public class Dimension {
    private int length;
    private int width;

    public Dimension(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getArea() {
        return length * width;
    }
}
