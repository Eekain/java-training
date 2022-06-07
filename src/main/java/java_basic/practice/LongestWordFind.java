package java_basic.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestWordFind {
    /*

    ### Szélsőérték keresés tétele

    Hozzatok létre szavak listáját, és keressétek ki a leghosszabb szót!
     */
    public static void main(String[] args) {
        List<String> wordList = new ArrayList<>(Arrays.asList("Hozzatok", "létre", "egy", "egész", "számok", "listáját"));
        String longWord = "";
        for(String s : wordList){
            longWord = s.length() > longWord.length() ? s : longWord;
        }

        System.out.println(longWord + " is the longest word");

    }

}
