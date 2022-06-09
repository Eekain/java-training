package java_advanced.collections.innerclasses;

import java.util.Comparator;

public class StringComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        if (o1.equals(o2)) {
            return 0;
        } else {
            return (((String) o1).compareToIgnoreCase((String) o2));

        }
    }
}
