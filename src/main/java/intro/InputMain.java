package intro;

import java.util.Scanner;

public class InputMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give name hooman");
        String name = scanner.nextLine();
        System.out.println("give AGE");
        int age = scanner.nextInt();

        System.out.println("Welcome " + name + "!");
        System.out.println("years since birth: "+ age);
    }

}
