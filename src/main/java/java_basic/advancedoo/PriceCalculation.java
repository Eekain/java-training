package java_basic.advancedoo;

public abstract class PriceCalculation {
    private String productName;
    public abstract void calculatePrice();

    public PriceCalculation(String productName) {
        this.productName = productName;
    }
}
