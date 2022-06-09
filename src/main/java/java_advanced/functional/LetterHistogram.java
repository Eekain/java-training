package java_advanced.functional;

import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class LetterHistogram {

    public static void main(String[] args) {
        String text = """
                 var - java9 óta
                 var names = new ArrayList<String>(); //ha a statikus típusban nincs meghatározva, akkor a dinamikus típusban kell megadni a diamond operátorban a kezelt objektumtípust
                 var-t csak lokális változóknál illik használni
                 ###gyors összefoglaló volt a múlt heti basic alatt
                 hétfő déllelőtt: projektfeladat
                                
                read in from CSV file for tutors and subjects...?
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
                                
                Map: egy interfész, különböző implementációkkal
                                
                kollekciók tesztelését különösen támogatja a library: AssertJ
                                
                foreach az olvasásra szolgál, módosítást Iterator-os bejárásnál lehet.
                                
                comparator/comparable
                                
                ha nincs megadva comparator (tehát comparable alapján történik a rendezés) akkor a "Natural order" alapján történik rendezés
                                
                                
                COLLATOR
                Collections.sort(names, Collator.getInstance(new Locale("hu","HU")));
                //így magyar lokále alapján rendez
                                
                Collections.osztály
                statikus metódusok gyűjteménye
                unmodifyable - egy módosíthatatlan nézetét adja vissza az osztálynak.
                                
                shallow copy:
                referfenciát másol
                deep copy:
                új objektumot hoz létre, eredeti értékeivel
                                
                                
                lambda
                ötlet: át lehessen adni fügvényt paraméterként
                names.forEach((String name) -> {System.out.println(name);});
                //VAGY
                names.forEach(name ->System.out.println(name));
                                
                names.replaceAll(name -> na,me.toUpperCase());
                names.replaceAll(String::toUpperCase);
                a lambda kifejezések mögött mindíg olyan interfész van, amiben csak egy metódus van
                                
                                
                                
                                
                                
                forEach      Egy object a paraméter, void a visszatérési típus : Consumer
                replaceAll   Egy object paraméter, azonos típusú visszatérés: UnaryOperator
                removeIf     Egy object paraméter, logikai érték visszatérés: Predicate
                                
                (68 funkcionális interfész van a Java nyelvben)
                                
                streamek
                forrás (1) - közbülső elemek (x) - záró elem (1);
                                
                funkcionális programozás
                nem az objektum az alap, hanem a függvény:
                a függvényeket lehet kezelni,
                                
                Supplier : in: void; out : T
                Consumer : in: T; out: void
                BiConsumer: in: T, U; out : void
                Predicate: in: T,; out : boolean
                BiPredicate: in: T, U; out : boolean
                Function: in: T; out: U
                BiFunction: in: T, U; out: R
                UnaryOperator: in: T, out: T
                BinaryOperator: in: T, T; out: T
                                
                A főbb funkcionális interfészek (lambdában használhatók) ezek közé tartoznak.
                                
                Big data: ahol egy számítógép már nem elég az adatok feldolgozására.
                                
                záró műveletek
                count
                min/max
                findany/findfirst
                allmatch/anymatch/nonematch
                foreach
                reduce
                collect
                                
                                
                Collectors
                                
                                
                (CounterResult::new, CounterResult::accept, CounterResult::addAll)
                a  kollektor ezt egyszerűsíti, hiszen tartalmazza mindhárom összetevőt
                                
                előre definiált collectorok:
                String: joining
                Matematikai: avg, count, max, min, sum, summarize
                                
                """;
        var histogram = text.chars()
                .parallel()
                .mapToObj(i -> (char) i)
                .filter(Character::isAlphabetic)
                .map(Character::toLowerCase)
                .map(c -> Character.toString(c))
                .collect(Collectors.toConcurrentMap(
                        c -> c,
                        c -> 1,
                        (i, c) -> i+ 1
                       // () -> new TreeMap<>(Collator.getInstance(new Locale("hu", "HU")))
                ))
                .entrySet()
                .stream()
                .parallel()
                .sorted(
                        Comparator.comparingInt(Map.Entry<String, Integer>::getValue).reversed()

                )
                .map(e ->e.getValue() + " - " + e.getKey())
                .collect(Collectors.joining(", "))

                ;
        System.out.println(histogram);
    }
}
