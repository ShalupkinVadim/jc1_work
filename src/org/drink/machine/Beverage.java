package org.drink.machine;

public class Beverage extends  Product {

    public Beverage(String name, double price) {
        super(name, price);
    }

    public Beverage(String name, double price, int count) {
        super(name, price, count);
    }
}
