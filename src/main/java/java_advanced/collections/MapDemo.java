package java_advanced.collections;

import javax.swing.text.html.Option;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class MapDemo {

    public static void main(String[] args) {
        Map<String, String> dict = new HashMap<>();
        dict.put("apple", "alma");
        dict.put("dog", "kutya");
        dict.put("chair", "szék");

        System.out.println(dict);
        System.out.println(dict.get("dog"));

        dict.put("dog", " blöki");
        System.out.println(dict);

        System.out.println(dict.get("cat"));
        System.out.println(dict.containsKey("cat"));

        if(dict.containsKey("cat")){
            System.out.println(dict.get("cat"));
        }
        Optional
                .ofNullable(dict.get("cat"))
                .ifPresent((v)-> System.out.println(v));

        Optional
                .ofNullable(dict.get("dog"))
                .ifPresent((v)-> System.out.println(v));

        //ilyet sose:
        /*for(String key: dict.keySet()){
            System.out.println(key + " - " + dict.get(key)); // a get keresést végez, így ahányszor előjön, annyiszor keresést végez
        }*/
        //inkább:
        for(Map.Entry e :dict.entrySet()){
            System.out.println(e.getKey() + " - " + e.getValue());
        }
    }
}
