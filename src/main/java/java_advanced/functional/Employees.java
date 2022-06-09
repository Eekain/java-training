package java_advanced.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Employees {
    private List<Employee> employees;

    public Employees(List<Employee>employees){
        this.employees = employees;
    }

    public Employee findBy(Predicate<Employee> predicate){
        for(var employee: employees){
            if(predicate.test(employee)){
                return employee;
            }
        }
        throw new IllegalArgumentException("Not found for: "+ predicate);
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(List.of(
                new Employee("John Doe", 1954),
                new Employee("Joan Doe", 1965)
        ));
        Employees firm = new Employees(employees);
        firm.findBy( new NameCriteria("John Doe"));
        firm.findBy(new Predicate<Employee>() {
            @Override
            public boolean test(Employee employee) {
                return employee.getYearOfBirth() == 1965;
            }
        });

        firm.findBy(e -> e.getYearOfBirth() == 1970);
    }

}
