package org.example.Uppgift1;

public class QuantityDiscount extends BaseDiscount{

    public QuantityDiscount(Discount nextDiscount) {
        super(nextDiscount);
    }

    @Override
    protected boolean isApplicable(Product product) {
        return false;
    }

    @Override
    protected double calculateDiscount(Product product) {
        return 0;
    }

    @Override
    public String getDescription(Product product) {
        return super.getDescription(product);
    }
}
