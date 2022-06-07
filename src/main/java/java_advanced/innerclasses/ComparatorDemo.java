package java_advanced.innerclasses;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;

public class ComparatorDemo {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of( "JANE","jack", "john"));
        names.sort(new StringComparator());
        System.out.println(names);
        List<String> namesL = new ArrayList<>(List.of( "JANEE","jack Thompshon", "john Lithuan"));
        namesL.sort(new StringLengthComparator());
        System.out.println(namesL);
        List<String> namesLS = new ArrayList<>(List.of( "JANEE","jack Thompshon", "john Lithuan"));
        namesLS.sort(new Comparator<String>(){
            @Override
            public int compare(String o1, String o2){
                return o1.length() - o2.length();
            }
        });
        System.out.println(namesLS);

        //Java 8 :
        List<String> namesLoS = new ArrayList<>(List.of( "JANEE","jack Thompshon", "john Lithuan"));
        namesLoS.sort((o1, o2) -> o1.length()-o2.length()); //lambda
        System.out.println(namesLoS);
    }
}
