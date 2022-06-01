package strings;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class StringMain {
    public static void main(String[] args) {
        String first = "apple";
        String second = "apple";
        String hey = "hey ";
        System.out.println(first == second);

        char[] chars = new char[5];
        for(int i = 0; i<5; i++){
            chars[i] = (char)('a' + i);
        }

        String letters = new String(chars);
        System.out.println(letters == "abcde");
        System.out.println(letters.equals("abcde"));

        String part1 = "abc";
        String part2 = "de";
        String parts = part1+part2;
        System.out.println(letters == parts);

        String parts2 = "abc"+"de";
        System.out.println(parts2 == "abcde");

        String parts3 = parts.intern(); //a poolban használt stringet rántja elő
        System.out.println(parts3 == "abcde");

        System.out.println(Charset.defaultCharset());
        byte[] bytes = "alma".getBytes(StandardCharsets.UTF_8);
        System.out.println(bytes.length);
        String s = new String(bytes, StandardCharsets.UTF_8);
        String s4 = "    John Doe   ".strip();
        String s5 = ("    John Doe   ").trim();
//mára befejezés, vettünk még StringBuildert
        System.out.println();
        System.out.println(s4);
        System.out.println(s5);
    }
}
