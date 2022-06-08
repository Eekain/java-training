package java_advanced.collections;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Histogramm {

    /*
    Van egy stringem, ami áll karakterekből, számoljuk meg, és írjuk ki, hog ymeéyik karakterekből hány darab van benne

     */


    private Map<Character, Long> map;

    public Histogramm() {

    }

    public static void main(String[] args) {
        Histogramm hg = new Histogramm();
        hg.map = hg.mapFiller("""
                name, subject
                XY | physics
                remove studentnél paraméterül a nevet használjuk
                findstudentbyname: ha nincs, optionalt return
                                
                teszt...
                a nyilak meghívást (általában lista formában) jelentenek
                                
                a konstruktor után a metódusok sorrendje a hívás sorrendjében legyen
                                
                dependency injection
                                
                removeStudent: nemm fogja megtalálni a students.contain után közvetlenül a students.remove, mert másik dologra keres a heap-en
                DTO: data transfer object - új objektum, amibe bemásoljuk az entitás adatait, és azzal térünk vissza.
                                
                ha nem írsz unit testet akkor az nem refraktorálás
                                
                Anonymous inner class
                Comparator, név nélküli belsőosztálypéldányosítás
                AWG/Swing eseménykezelőknél
                                
                ott használhatunk lambda interfészeket, ahol a háttérben az interfésznek egy, és csakis egy metódusa van
                                
                referenciatípusú változó = osztály, vagy interfész
                                
                Kollekcióknál gyorsítja a keresést a hash használata
                                
                Set: (interfész)
                 a {halmaz} nem enged duplikációt a listával ellentétben
                 nincs sorrend, ellentétben a listával
                                
                 ha két objektum equals, akkor a hashkódja ugyanaz kell, hogy legyen.
                 hashből max int határértéken belüli érték lehet, mert intet ad vissza az algoritmus
                                
                 ha felülírod az equals metódust, akkor fel kell írni a hash metódust is.
                                
                Adatszerkezetek
                A LinkedList nemcsak a List intefészt implementálja (mint az ArrayList), hanem a Queue interfészt is.
                LinkedHashSet - alapjában véve egy hashset, azonban az elemeket egy kétirányba tárolt listába is felfűzi
                megtartja a berakás sorrrendjét
                                
                Java nyelven van a Deque (dekk) interfész, ami a queue interface leszármazottja, ami egy kétvégű sor, aminek mindkét végéhez hozzá lehet férni.... ezt használjuk verem helyett
                                
                ArrayDeque - a stack (és deque) implementálása.
                                
                Map: egy interfész, különböző implementációkkal""");
        for(Map.Entry e : hg.getMap().entrySet()){

            System.out.println(e.getKey() + ": " + e.getValue());
        }
    }

    private Map<Character, Long> mapFiller(String s) {
        //Map<Character, Integer> result = new HashMap<>();
        /*for(char c : s.toCharArray()){
            c = Character.toLowerCase(c);
            if(Character.isAlphabetic(c)){
                result.compute(c, (k, v) -> v == null ? 1: v+1);
            }
            *//*if(c == ' '|| c == '\n'){
                continue;
            }


            if(!map.containsKey(c)){
                map.put(c, 1);
            } else {
                map.put(c, map.get(c)+1);
            }*//*

        }*/
        return  s.chars()
                .mapToObj(i -> (char) i)
                .filter(c -> Character.isAlphabetic(c))
                .map(c -> Character.toLowerCase(c))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    public Map<Character, Long> getMap() {
        return map;
    }
}
