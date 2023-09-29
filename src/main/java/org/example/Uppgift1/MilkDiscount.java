package org.example.Uppgift1;

public class MilkDiscount extends BaseDiscount{

    public MilkDiscount(Discount nextDiscount) {
        super(nextDiscount);
    }

    @Override
    protected boolean isApplicable(Product product) {
        return product.getName().equalsIgnoreCase("Milk");
    }

    @Override
    protected double calculateDiscount(Product product) {
        return product.getPrice() * 0.05;
    }

    @Override
    public String getDescription(Product product) {
        if (isApplicable(product)) {
            return super.getDescription(product) +
                    nextDiscount.getDescription(product) + "5% rea på mjölk! ";

        }
        return super.getDescription(product) + nextDiscount.getDescription(product);
    }
}
