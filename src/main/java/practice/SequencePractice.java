package practice;

import java.util.ArrayList;
import java.util.List;

public class SequencePractice {
    /*
    Készíts egy Sequence nevű osztályt,, amelynek main() metódusában oéldányosíts le egy List<Integer> elements listát oly módon, hogy
    már eleve legyen benne két tetszőleges szám, de legyen lehetőség arra, hogy továbbiakat is hozzáadhass! Ciklusodban adj néhány
     új elemet a listához úgy, hogy minden következő elem a sorban előtte levő két szám szorzata legyen!

     végül írd ki konzolra a lista tartalmát és a méretét is!
     */
    public static void main(String[] args) {
        List<Integer> elements = new ArrayList<>(List.of(1, 2));

        for (int i = 2; i < 9; i++) {
            elements.add(elements.get(i - 2) * elements.get(i - 1));
        }

        System.out.println(elements);
        System.out.println("Size of list: " + elements.size());

    }

}
