package java_advanced.innerclasses;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Numbers {
    public static void main(String[] args) {
        Set<Integer> n = new LinkedHashSet<>();
        System.out.println(n);

        n.add(150);
        n.add(20);
        n.add(31);
        n.add(10);
        n.add(102);
        System.out.println(n);
        n.add(20);
        System.out.println(n);


    }
}
