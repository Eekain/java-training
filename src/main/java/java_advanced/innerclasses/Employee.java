package java_advanced.innerclasses;

import java.util.Objects;

public class Employee {
    String name;
    public Employee(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("John Doe");
        Employee e2 = new Employee("John Doe");

        System.out.println(e1 == e2);
        System.out.println(e1.equals(e2));
        System.out.println(e1.equals("Jane Doe"));
        System.out.println(e1.equals(null));
        System.out.println(null instanceof Object);
        Employee e3 =new Employee(null);
        System.out.println(e3.equals(e1));

    }
}
