package org.example.Uppgift1;

public abstract class BaseDiscount implements Discount{
    private Discount nextDiscount;

    public BaseDiscount() {
    }


    protected abstract boolean isApplicable(Product product);
    protected abstract double calculateDiscount(Product product);
}
