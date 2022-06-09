package java_advanced.practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamPractice {
    /*Nevezetes programozási tételek
    Összegzés tétele

    Hozzatok létre egy egész számok listáját, és számoljátok ki a számok összegét!
    */
    private int listOfIntSum(List<Integer> li){
        return li.stream().mapToInt(l -> l).sum();
    }
    /*
    Számlálás tétele

    Hozzatok létre egy egész számok listáját, pozitív és negatív számokkal, és számoljátok össze, hogy hány negatív szám szerepel a listában!

    */
    private int countMinus(List<Integer> li){
        return (int) li.stream().filter(i -> i<0).mapToInt(i -> i).count();
    }
    /*
    Szélsőérték keresés tétele
    Hozzatok létre szavak listáját, és keressétek ki a leghosszabb szót!
    */
    private String longestWord(List<String> words){
        return words.stream().max(Comparator.comparingInt(String::length)).toString();
    }
    /*
    Eldöntés tétele

    Mond meg egy egész számokat tartalmazó listáról, hogy csak páros számokat tartalmaz-e!
    */
    private boolean onlyEven(List<Integer> li){
        return li.stream().allMatch( i -> i%2==0);
    }
    /*
    Transzformáció

    Hozz létre egy Employee osztályt, névvel. Majd hozz létre egy Employee objektumokat tartalmazó listát! Hozz létre egy olyan másik String listát, mely az alkalmazottaknak csak a neveit tartalmazza!

    List -> List
    */
    private List<String> employeeNames(List<Employee> emps){
        return emps.stream().map(Employee::getName).toList();
    }
    /*
    Szűrés

    Hozz létre egy List objektumot, és szűrd ki belőle a 100_000-nél nagyobb fizetésű alkalmazottakat. Hozz létre egy új listát a feltételnek megfelelő alkalmazottakkal.*/
    private List<Employee> poorOnes(List<Employee> employees){
        return employees.stream().filter(i -> i.getSalary()<100000).toList();
    }
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Bobby", 100000));
        employees.add(new Employee("Kate", 80000));
        employees.add(new Employee("Rbbbie", 150000));
        employees.add(new Employee("Richie", 200000));

        StreamPractice sp = new StreamPractice();
        System.out.println("Sum of ints: " + sp.listOfIntSum(List.of(4,6,3,545,34,325,234,2,1,5,3,243,23,24)));
        System.out.println("Count of negatives in list: " + sp.countMinus(List.of(4,6,3,545,34,325,-234,2,1,5,3,243,23,24)));
        System.out.println("Longest word in list: " + sp.longestWord(List.of("words", "woooords", "megszentségeskedéseitekért", "elkelkáposztástalaníthatatlanságoskodásaitokért")));
        System.out.println("Can these even...? "+ sp.onlyEven(List.of(4,6,3,545,34,325,234,2,1,5,3,243,23,24)));
        System.out.println("Employee names: " + sp.employeeNames(employees));
        System.out.println("List of poor employees: " + sp.poorOnes(employees));

    }
}
