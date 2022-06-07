package java_basic.practice;

import java.util.ArrayList;
import java.util.List;

public class TransformationPractice {
    /*
    ## Transzformáció

    Hozz létre egy Employee osztályt, névvel. Majd hozz létre egy Employee
    objektumokat tartalmazó listát!
    Hozz létre egy olyan másik String listát, mely az alkalmazottaknak csak a neveit
    tartalmazza!

     */
    public static void main(String[] args) {
        List<Employee> workers = new ArrayList<>();

        workers.add(new Employee("Bobby"));
        workers.add(new Employee("Charles"));
        workers.add(new Employee("Eddie"));
        workers.add(new Employee("Mary"));
        workers.add(new Employee("Forneth"));


        List<String> names = new ArrayList<>();
        for (Employee e : workers) {
            names.add(e.getName());
        }

        System.out.println(names);

    }
}

