package org.example.Uppgift1;

public class QuantityDiscount extends BaseDiscount{

    public QuantityDiscount(Discount nextDiscount) {
        super(nextDiscount);
    }

    @Override
    protected boolean isApplicable(Product product) {
        return product.getQuantity() >= 5;
    }

    @Override
    protected double calculateDiscount(Product product) {
        return product.getQuantity() * 10;
    }

    @Override
    public String getDescription(Product product) {
        if (isApplicable(product)) {
            return super.getDescription(product) +
                    nextDiscount.getDescription(product) + "10kr rea per produkt vid köp av fler än 5 produkter! ";

        }
        return super.getDescription(product) + nextDiscount.getDescription(product);
    }
}
