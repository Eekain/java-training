package practice;

import java.util.ArrayList;
import java.util.List;

public class SumPractice {
    /*
    ### Összegzés tétele

    Hozzatok létre egy egész számok listáját, és számoljátok ki a számok összegét!
    */
    public static void main(String[] args) {
        List<Integer> summand = new ArrayList<>();
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 1 || i % 2 == 0) {
                summand.add(i);
            }
        }
        //összegszámolás:
        int sum = 0;
        for (int i : summand) {
            sum += i;
        }

        System.out.println("Kiszámolt összeg: " + sum);
    }
}
