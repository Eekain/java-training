package inter;

public class PriceMain {

    public static void main(String[] args) {
        CanCalculatePrice price = new LengthPriceCalculator("aaa");
        System.out.println(price.calculatePrice());
    }
}
