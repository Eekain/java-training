package java_advanced.streamsalgorithms;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;

public class Employee {
    private String name;
    private int yearOfBirth;

    public Employee(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Bobby Richards", 1978));
        employees.add(new Employee("Welena Williterallywho", 1983));
        employees.add(new Employee("Chris Tinha", 1996));
        employees.add(new Employee("Sandra Charles", 2000));
        employees.add(new Employee("Michael Michael", 1478));

        int sumOfYears = employees.stream().mapToInt(Employee::getYearOfBirth).sum();
        System.out.println("Summing birthyears of employees: " + sumOfYears);
        int sumOfAges = employees.stream().mapToInt(e -> 2022-e.getYearOfBirth()).sum();
        System.out.println("Summing ages of employees: " + sumOfAges);
        int numOfEmployees = (int) employees.stream().count();
        System.out.println("Counting employees using streams: " + numOfEmployees);
        int oldOnesCount = (int) employees.stream().filter(e -> e.getYearOfBirth()<1990).count();
        System.out.println("Counting the Old Ones: " + oldOnesCount);
        int earliest = employees.stream().mapToInt(Employee::getYearOfBirth).min().orElseThrow();
        System.out.println("The oldest in number of years is: "+ earliest);
        //String earliestName = employees.stream().sorted(Comparator.compare((e1, e2) -> e1.getYearOfBirth() - e2.getYearOfBirth())).findFirst();// nope, noot yet
        //System.out.println(earliestName); //6. feladat //allmatch fügvény
        //7. Add vissza, hogy igaz-e, hogy minden alkalmazott 1980 előtt született.
        boolean are;
        //8. Add vissza egy listában az összes, 1990-nél korábban született alkalmazotztat!
        List<Employee> oldOnes = employees.stream().filter(employee -> employee.getYearOfBirth()<1990).toList();
        System.out.println("List of old Ones: " + oldOnes);
        //9. Add vissza egy listában az összes alkalmazott nevét
        List<String> names = employees.stream().map(Employee::getName).toList();
        //10 Az előző két feéladat kombinációja: Adfd vissza egy listában az összes, 1990-nél korábban született alkalmazott nevét
        List<String> oldOnesByName = employees.stream().filter(employee -> employee.getYearOfBirth()<1990).map(Employee::getName).toList();
        System.out.println("Old Ones By Name Not To Forget: " + oldOnesByName);



    }
}
