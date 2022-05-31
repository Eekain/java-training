package console;

import java.util.List;
import java.util.Scanner;

public class Controller {
    //ui
    //adatokat bekérni/kiírni
    //Scanner attribútum, felhasználása újra meg újra ezen osztályon belül
    //BS attribútum
    private Scanner scan = new Scanner(System.in);
    private BookShelf bs = new BookShelf();

    public void start() {

        boolean run = true;
        do {
            printmenu(); //comment this out to sh...down intelliJ's neck
            //on Build #IC-221.5591.52

            String choice = scan.nextLine();


            switch (choice) {
                case "1" -> inputBooks();
                case "2" -> printBooks();
                case "3" -> run = false;
            }
        } while (run);
    } //elkezdi a felhasználóval akommunikációt

    private void printmenu() {
        String Menu = """
                Mit szeretnél csinálni?
                [1] Könyvet fölvenni
                [2] Könyveket listázni
                [3] Exit
                """;
        System.out.println(Menu);
    }// kiírja a menüt

    private void inputBooks() {
        System.out.println("Mi a címe?");
        String title = scan.nextLine();
        System.out.println("Mikori kiadású?");
        String yearString = scan.nextLine();
        int year = Integer.parseInt(yearString);
        //scan.nextLine();
        bs.addBook(title, year);
    } // létrehozza a könyveket

    public void printBooks() {
        List<Book> bookList = bs.getBooks();

        for (Book b : bookList) {
            System.out.println(b.getTitle());
        }
    } //

}
