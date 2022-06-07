package java_basic.practice;

public class Employee {
    private String name;

    private int payInHuf;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPayInHuf() {
        return payInHuf;
    }

    public void setPayInHuf(int payInHuf) {
        this.payInHuf = payInHuf;
    }
}
