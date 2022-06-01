package oo;

public class ObjectOrientedDemo {

    public static void main(String[] args) {
        Book book = new Book("Java Advanced", 1997);
        Book another = new Book(book);

        System.out.println(another.getName() + another.getYear());
    }
}
