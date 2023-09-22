package org.example.Uppgift1;

public class FridayDiscount extends BaseDiscount{

    public FridayDiscount(Discount discount) {
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
