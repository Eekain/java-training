package practice;

import java.util.ArrayList;
import java.util.List;

public class CountPractice {
    /*

    ### Számlálás tétele

    Hozzatok létre egy egész számok listáját, pozitív és negatív számokkal,
    és számoljátok össze, hogy hány negatív szám szerepel a listában!
     */
    public static void main(String[] args) {
        List<Integer> posNeg = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                posNeg.add(i);
            } else {
                posNeg.add(i * (-1));
            }


        }
        int sum = 0;
        for (int i : posNeg) {
            if (i < 0) {
                sum++;
            }
        }
        System.out.println("Negative numbers counted: " + sum);
    }
}
