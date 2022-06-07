package java_basic.console;

public class Book {
    private  String title;
    private int year;

    public Book (String title, int year){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
