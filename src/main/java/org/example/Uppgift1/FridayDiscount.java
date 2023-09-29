package org.example.Uppgift1;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class FridayDiscount extends BaseDiscount {

    public FridayDiscount(Discount nextDiscount) {
        super(nextDiscount);
    }

    @Override
    protected boolean isApplicable(Product product) {
        return LocalDate.now().getDayOfWeek().equals(DayOfWeek.FRIDAY);
    }

    @Override
    protected double calculateDiscount(Product product) {
        return product.getPrice() * 0.1;
    }

    @Override
    public String getDescription(Product product) {
        if (isApplicable(product)) {
            return super.getDescription(product) +
                    nextDiscount.getDescription(product) + "10% rea på fredagar! ";

        }
        return super.getDescription(product) + nextDiscount.getDescription(product);
    }
}
