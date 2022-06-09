package java_advanced.practice;

public class Employee {

//    Hozz létre egy Employee osztályt, névvel. Majd hozz létre egy Employee objektumokat tartalmazó listát!
//    Hozz létre egy olyan másik String listát, mely az alkalmazottaknak csak a neveit tartalmazza!
    private String name;
    private long salary;

    public Employee(String name, long salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public long getSalary() {
        return salary;
    }
}
