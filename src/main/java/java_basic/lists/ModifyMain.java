package java_basic.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
// \java-bgn-2022-05-30 a training 360 githubján
public class ModifyMain {
    public static void main(String[] args) {
        List<Integer> numbers= new ArrayList<>(List.of(1,3,4));
        var it = numbers.iterator(); //this is an iterator
        while (it.hasNext()){
            var number = it.next(); // újabb
            if (number % 2 == 0){
                it.remove();
            }
        }
    }
}
