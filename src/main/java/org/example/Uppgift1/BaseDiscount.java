package org.example.Uppgift1;

public abstract class BaseDiscount implements Discount{
    private Discount nextDiscount;

    public BaseDiscount(Discount nextDiscount) {
        this.nextDiscount = nextDiscount;
    }

    @Override
    public int apply(Product product) {
        return 0;
    }

    @Override
    public String getDescription(Product product) {
        return null;
    }

    protected abstract boolean isApplicable(Product product);
    protected abstract double calculateDiscount(Product product);
}
