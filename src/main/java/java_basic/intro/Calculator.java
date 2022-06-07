package java_basic.intro;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("GIVE FIRST NUMBER (A)");
        int a = scan.nextInt();
        System.out.println("GIVE FIRST NUMBER (B)");
        int b = scan.nextInt();
        System.out.printf("GIVEN NUMBERS ARE A: %d, B: %d, PRODUCT OF B+A: %d \n", a, b, a+b);

    }
}
