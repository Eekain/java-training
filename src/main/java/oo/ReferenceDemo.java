package oo;

import java.util.*;

public class ReferenceDemo {


    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Jill", "Jack"));
        List<String> employees = names;

        employees.set(1, "Jack");

        System.out.println(names); // az employees és names egyazon listára mutat
        List<String> copyOfNames = new ArrayList<>(names);

        copyOfNames.set(0, "NotJill");
        System.out.println(copyOfNames + " is the copy");
        System.out.println(names + " is the original");




    }
}
