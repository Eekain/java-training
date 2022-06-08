package java_advanced.collections;

import java_basic.arrays.ArraysMain;

import java.text.Collator;
import java.util.*;

public class BookMain {

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>(
                List.of(
                    new Book("ccc", "yyysdfg"),
                    new Book("bbbc", "xyy"),
                    new Book("aac", "xxy"),
                    new Book("cb", "xxdgfsx")
                )
        );

        //Collections.sort(books); // natural order
        Collections.sort(books,  new BookTitleLengthComparator());
        //System.out.println(books);
        Set<Book> bookSet = new TreeSet<>(new BookTitleLengthComparator());
        bookSet.addAll(books);
        System.out.println(bookSet);

        for(var book: bookSet){
            System.out.println(book);
        }
        //class collections cannot be cast to class java.lang.Comparable
//        Set<Employee> employees = new TreeSet<>();
//        employees.add(new Employee("John Doe"));
        Set<Employee> employees = new TreeSet<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        employees.add(new Employee(new HiringRequest("John Doe", "321",23), 213));

        List<String> names = new ArrayList<>(List.of("Bob", "George", "Árpád", "László", "Artúr"));
        Collections.sort(names, Collator.getInstance(new Locale("hu","HU")));
        System.out.println(names);
    }
}
