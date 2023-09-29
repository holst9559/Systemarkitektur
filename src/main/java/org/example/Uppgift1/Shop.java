package org.example.Uppgift1;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class Shop {
    public static void main (String[] args) {
        Product bryggverk = new Product("Grainfather", 4299, 10);
        Product milk = new Product("Milk", 14.99,4);

        Discount discountChain = new FridayDiscount(new MilkDiscount(new QuantityDiscount(new NoDiscount())));


        double discountedPriceMilk = discountChain.apply(milk);
        System.out.println("Du har valt att köpa " + milk.getQuantity() + " st " + milk.getName());
        System.out.println("Pris innan rabbater: " + milk.getPrice());
        System.out.println("Pris efter rabbater: " + (milk.getPrice() - discountedPriceMilk) + "kr");
        System.out.println(discountChain.getDescription(milk));
        System.out.println("Rabbatmängd i kr: " + discountedPriceMilk + "kr");
        System.out.println("\t");

        double discountedPriceBryggverk = discountChain.apply(bryggverk);
        System.out.println("Du har valt att köpa " + bryggverk.getQuantity() + " st " + bryggverk.getName());
        System.out.println("Pris innan rabbater: " + bryggverk.getPrice() + "kr");
        System.out.println("Pris efter rabbater: " + (bryggverk.getPrice() - discountedPriceBryggverk) + "kr");
        System.out.println(discountChain.getDescription(bryggverk));
        System.out.println("Rabbatmängd i kr: " + discountedPriceBryggverk + "kr");





    }
}
