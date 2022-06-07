package java_basic.detailed;

public class Literals {

    public Literals(Long id ) {
        System.out.println(id);
    }

    public static void main(String[] args) {
        var i = 12;
        long l = 34;

        new Literals(12L); // = (long) 12
        char c = 'a';

        System.out.println(c >  'b');

        int a = Integer.parseInt("123");
        double b = Double.parseDouble("231");

        String s = String.valueOf(5);
        System.out.println(s);

    }
}
