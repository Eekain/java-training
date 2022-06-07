package java_basic.console;

import java.util.ArrayList;
import java.util.List;

public class BookShelf {
    private List<Book> books = new ArrayList<>();
    public void addBook(String title, int year){
           this.books.add(new Book(title, year));
    }
    public List<Book> getBooks(){
        return books;
    } // tárolt könyvek listáját visszaadja


}
