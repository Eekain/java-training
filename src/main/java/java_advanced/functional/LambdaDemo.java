package java_advanced.functional;

import java.util.function.UnaryOperator;

public class LambdaDemo {

    public static void main(String[] args) {
        UnaryOperator<String> firstToLetter = s -> s.substring(0,2); //az interfész metódusát implementálja
        System.out.println(firstToLetter.apply("Nonnx"));
    }
}
