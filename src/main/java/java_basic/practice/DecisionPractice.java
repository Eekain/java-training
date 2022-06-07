package java_basic.practice;

import java.util.ArrayList;
import java.util.List;

public class DecisionPractice {
    /*

    ### Eldöntés tétele

    Mond meg egy egész számokat tartalmazó listáról, hogy csak
    páros számokat tartalmaz-e!
     */
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(4);
        numbers.add(7);

        boolean evenOnly = true;
        for (int i : numbers) {
            if (i % 2 != 0) {
                evenOnly = false;
                break;
            }
        }

        System.out.println(evenOnly ? "Only even numbers were found" : "There was at least one odd number");
    }
}
