package java_advanced.collections;

import java.util.Comparator;

public class Book implements Comparable<Book> {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public int compareTo(Book o) {
        var result =  author.compareTo(o.author);
        if(result == 0){
            result = title.compareTo(o.title);
        }

        return result;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
