package practice;

import java.util.ArrayList;
import java.util.List;

public class SelectPractice {
    /*
    ## Szűrés

    Hozz létre egy List<Employee> objektumot, és szűrd ki belőle a 100_000-nél
    nagyobb fizetésű alkalmazottakat. Hozz létre egy új listát a feltételnek
    megfelelő alkalmazottakkal.
     */
    public static void main(String[] args) {
        List<Employee> workers = new ArrayList<>();

        workers.add(new Employee("Bobby"));
        workers.add(new Employee("Charles"));
        workers.add(new Employee("Eddie"));
        workers.add(new Employee("Mary"));
        workers.add(new Employee("Forneth"));

        int pay = 90_000;
        for (Employee e : workers) {
            e.setPayInHuf(pay);
            pay += 7000;
        }

        List<Employee> richOnes = new ArrayList<>();

        for (Employee e : workers) {
            if (e.getPayInHuf() > 100_000) {

                richOnes.add(e);

                System.out.print(e.getName() + " ");
            }
        }
        System.out.println("");


    }
}
