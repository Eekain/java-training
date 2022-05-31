package employees;

public class Employee {
    private String name;
    private int salary;
    public void increaseSalary(double percent){
        salary = (int)(salary + salary * percent / 100);
    }

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    public String getInfo(){
        return this.name + "has a salary of " + this.salary;
    }
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
}
