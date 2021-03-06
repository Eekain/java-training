package java_advanced.streamsalgorithms;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.lang.Math.min;

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
        //String earliestName = employees.stream().filter(e -> e.getYearOfBirth() == (int) min(employees.stream().mapToInt(x -> x.getYearOfBirth()))).findFirst();
        //System.out.println(earliestName); //6. feladat //allmatch f??gv??ny
        //7. Add vissza, hogy igaz-e, hogy minden alkalmazott 1980 el??tt sz??letett.
        boolean are  = employees.stream().allMatch(s -> s.getYearOfBirth()<1990);
        System.out.println("Every one of the employees were born before 1990: "+are);
        //8. Add vissza egy list??ban az ??sszes, 1990-n??l kor??bban sz??letett alkalmazotztat!
        List<Employee> oldOnes = employees.stream().filter(employee -> employee.getYearOfBirth()<1990).toList();
        System.out.println("List of old Ones: " + oldOnes);
        //9. Add vissza egy list??ban az ??sszes alkalmazott nev??t
        List<String> names = employees.stream().map(Employee::getName).toList();
        //10 Az el??z?? k??t fe??ladat kombin??ci??ja: Adfd vissza egy list??ban az ??sszes, 1990-n??l kor??bban sz??letett alkalmazott nev??t
        List<String> oldOnesByName = employees.stream().filter(employee -> employee.getYearOfBirth()<1990).map(Employee::getName).toList();
        System.out.println("Old Ones By Name Not To Forget: " + oldOnesByName);



    }

}
