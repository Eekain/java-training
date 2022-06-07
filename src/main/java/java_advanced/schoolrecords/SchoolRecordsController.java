package java_advanced.schoolrecords;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SchoolRecordsController {
    private School school = new School();
    private static ClassRecords classRecords = new ClassRecords("Első osztály");

    public static void initSchool() {


    }

    public static void main(String[] args) {
        List<Tutor> tutors = new ArrayList<>();
        List<Subject> subjects = new ArrayList<>();
        ClassRecords classRecords = new ClassRecords("Első osztály");


    }

    public void runMenu() {
        menuToConsole();

    }

    public void menuToConsole() {
        System.out.println("1. Diákok nevének listázása\n" +
                "2. Diák név alapján keresése\n" +
                "3. Diák létrehozása\n" +
                "4. Diák név alapján törlése\n" +
                "5. Diák feleltetése\n" +
                "6. Osztályátlag kiszámolása\n" +
                "7. Tantárgyi átlag kiszámolása\n" +
                "8. Diákok átlagának megjelenítése\n" +
                "9. Diák átlagának kiírása\n" +
                "10. Diák tantárgyhoz tartozó átlagának kiírása\n" +
                "11. Kilépés");
    }
}
