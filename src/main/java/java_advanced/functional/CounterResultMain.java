package java_advanced.functional;

import java.util.List;

public class CounterResultMain {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1478, 34 , 24,2, 0, 5,23, 4,-231,1241, -2342);
        /*CounterResult cr = new CounterResult();
        for(var i: numbers){
            cr.accept(i);
        }*/

        //CounterResult cr = numbers.stream().collect(CounterResult::new, CounterResult::accept, CounterResult::addAll);
        CounterResult cr = numbers.stream().collect(CounterResult.collector());
        System.out.println(cr);
        var anotherResult = numbers.stream().reduce(new ImmutableCounterResult(0,0,0), ImmutableCounterResult::accept, ImmutableCounterResult::combine);
        System.out.println(anotherResult);
    }
}
