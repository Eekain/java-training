package java_advanced.collections;

public class Employee {
    private long id;
    private String name;
    private String yearOfBirth;
    private long salary;

    public Employee(HiringRequest hr, long id) {
        this.id = id;
        this.name = hr.getName();
        this.yearOfBirth = hr.getYearOfBirth();
        this.salary = hr.getSalary();
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getYearOfBirth() {
        return yearOfBirth;
    }

    public long getSalary() {
        return salary;
    }
}
