package employees;

import java.util.Scanner;

public class EmployeeMain {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Do you wish to hire an employee?");
        String ansFirst = scan.nextLine();
        if(ansFirst.equals("YES") || ansFirst.equals("yes")){
            System.out.println("Please give a name for the new guy.");
            String name = scan.nextLine();
            Employee johnny = new Employee(name, 15_000);
            johnny.getInfo();
            johnny.increaseSalary(8.4);

            System.out.println(johnny.getInfo());
        } else {
            System.out.println("Either you can't spell, or you don't want a new employee.\nWhy are you here?");
        }
        scan.close();

    }

}
