package java_advanced.collections;

public class IdentityValue {
    //IV : id, name, yearOfBirth
    private long id;
    private String name;
    private String YearOfBirth;

    public IdentityValue(long id, String name, String yearOfBirth) {
        this.id = id;
        this.name = name;
        YearOfBirth = yearOfBirth;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getYearOfBirth() {
        return YearOfBirth;
    }

    @Override
    public String toString() {
        return "IdentityValue{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", YearOfBirth='" + YearOfBirth + '\'' +
                '}';
    }
}
