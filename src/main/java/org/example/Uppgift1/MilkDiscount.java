package org.example.Uppgift1;

public class MilkDiscount extends BaseDiscount{
    @Override
    protected boolean isApplicable(Product product) {
        return false;
    }

    @Override
    protected double calculateDiscount(Product product) {
        return 0;
    }

    @Override
    public int apply(Product product) {
        return 0;
    }

    @Override
    public String getDescription(Product product) {
        return null;
    }
}
