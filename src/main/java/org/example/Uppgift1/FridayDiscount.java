package org.example.Uppgift1;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class FridayDiscount extends BaseDiscount{

    public FridayDiscount(Discount nextDiscount) {
        super(nextDiscount);
    }

    @Override
    protected boolean isApplicable(Product product) {
        DayOfWeek today = LocalDate.now().getDayOfWeek();
        return today == DayOfWeek.FRIDAY;
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
