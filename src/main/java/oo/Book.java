package oo;

public class Book {
    private String name;
    private  int year;
    private boolean favourite;


    public Book(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public Book(Book another) {
         another.name = this.name;
         another.year = this.year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", favourite=" + favourite +
                '}';
    }
}
