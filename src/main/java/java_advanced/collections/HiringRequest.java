package java_advanced.collections;

public class HiringRequest {
    private String name;
    private String yearOfBirth;
    private long salary;

    public HiringRequest(String name, String yearOfBirth, long salary) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.salary = salary;
    }

    public String getYearOfBirth() {
        return this.yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public long getSalary() {
        return salary;
    }
}
