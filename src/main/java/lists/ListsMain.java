package lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListsMain {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(); //előre mindíg az interfészt írjuk, nem az implementációt, hogy később könnyebben lehessen cserélni
        //<> is called a diamond operator
        names.add("John");
        names.add("Jack");
        System.out.println(names);
        System.out.println(names.get(1));
        names.set(1, "Jane");
        System.out.println(names);

        names.remove("Jane");
        System.out.println(names);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 5, 6); // egy módosíthatatlan hosszú listát ad vissza

        System.out.println(numbers);
        numbers.set(1, 10);
        System.out.println(numbers);
        //numbers.add(6); unsupported operation for simple array

        Integer[] arr = {1, 2, 3, 5, 6};
        List<Integer> nums = Arrays.asList(arr);
        System.out.println(nums);

        nums.set(1, 20);
        System.out.println(Arrays.toString(arr));

        // a 9. JAVA-tól kezdve nem szoktuk használni az Arrays.asList-et, inkább:
        List<Integer> ages = List.of(1, 2, 3, 5, 6);
        System.out.println(ages);
        //ages.set(1,20); // aList.of az egy módosíthatatlan (immutable) listát ad vissza;

        List<String> employees = new ArrayList<>(List.of("John", "Jacke")); //copyconstruktor. A paraméterül adott lista tartalmát átmásolja önmagába.
        employees.add("Jane");
        System.out.println(employees);

        for (String employee : employees) {
            System.out.println(employee);
        }


    }
}
