package org.example.Uppgift1;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class Shop {
    public static void main (String[] args) {
        Product bryggverk = new Product("Grainfather", 4299, 1);
        Product milk = new Product("Milk", 14.99,4);
        Product malt = new Product("Pilsnermalt",12.95, 50);
        //Discount chain på produkten

        Discount discountChain = new FridayDiscount(new MilkDiscount(new QuantityDiscount(new NoDiscount())));

        double discountedPriceMilk = discountChain.apply(milk);
        System.out.println(discountedPriceMilk);




    }
}
