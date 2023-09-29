package org.example.Uppgift1;

public abstract class BaseDiscount implements Discount{
    Discount nextDiscount;
    protected String description;

    public BaseDiscount(Discount nextDiscount) {
        this.nextDiscount = nextDiscount;
        this.description = "";
    }

    @Override
    public double apply(Product product) {
        double discount = 0;
        if (isApplicable(product)) {
            discount = calculateDiscount(product);
        }

        discount += nextDiscount.apply(product);
        return discount;
    }

    @Override
    public String getDescription(Product product) {
        return "";
    }

    protected abstract boolean isApplicable(Product product);
    protected abstract double calculateDiscount(Product product);
}
