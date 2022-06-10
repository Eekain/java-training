package java_advanced.functional;

import java.util.stream.Collector;

public class CounterResult {
    private int negative;
    private int zero;
    private int positive;

    public void accept(int number){
        if(number<0){
            negative++;
        }else if(number>0){
            positive++;
        } else {
            zero++;
        }
    }
    public int getNegative() {
        return negative;
    }

    public int getZero() {
        return zero;
    }

    public CounterResult addAll(CounterResult cr){
        negative += cr.negative;
        zero += cr.zero;
        positive += cr.positive;
        return this;
    }

    public int getPositive() {
        return positive;
    }

    @Override
    public String toString() {
        return "CounterResult{" +
                "negative=" + negative +
                ", zero=" + zero +
                ", positive=" + positive +
                '}';
    }

    //úgy tudjuk immutable-lé  tenni, hogy:
    public static Collector<Integer, CounterResult, CounterResult> collector(){
        return Collector.of(CounterResult::new, CounterResult::accept, CounterResult::addAll, Collector.Characteristics.UNORDERED, Collector.Characteristics.IDENTITY_FINISH);
    }

    public static CounterResult combine(CounterResult cr, CounterResult cr2){
        CounterResult cr3 = new CounterResult();
        cr3.positive = cr2.positive + cr.positive;
        cr3.negative = cr2.negative + cr.negative;
        cr3.zero = cr2.zero + cr.zero;
        return cr3;
    }
}
