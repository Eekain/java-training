package inter;

public class LengthPriceCalculator implements CanCalculatePrice{
    public LengthPriceCalculator(String productName) {
    }

    @Override
    public int calculatePrice() {
        return 2;
    }
}
