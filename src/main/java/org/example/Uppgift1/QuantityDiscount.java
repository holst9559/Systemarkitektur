package org.example.Uppgift1;

public class QuantityDiscount extends BaseDiscount{

    public QuantityDiscount(Discount discount) {
        super(discount);
    }

    @Override
    protected boolean isApplicable(Product product) {
        return false;
    }

    @Override
    protected double calculateDiscount(Product product) {
        return 0;
    }
}
