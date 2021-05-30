package com.company;


import java.util.LinkedHashMap;
import java.util.LinkedList;

public class SoftDrink extends Product {
    @Override
    public LinkedList<String> initProduct() {
        LinkedList<String> drinks = new LinkedList<>();
        drinks.add(" Coca Cola ");
        drinks.add(" Pepsi Cola ");
        drinks.add(" Spring water ");
        return drinks;
    }

    @Override
    public LinkedList<Integer> pricesOfProduct() {
        LinkedList<Integer> drinkPrice = new LinkedList<>();
        drinkPrice.add(150);
        drinkPrice.add(150);
        drinkPrice.add(130);
        return drinkPrice;
    }

    @Override
    public LinkedHashMap<String, Integer> priceList() {
        LinkedHashMap<String, Integer> drinkPriceList = new LinkedHashMap<>();
        for (int i = 0; i < 3; i++) {
            drinkPriceList.put(initProduct().get(i), pricesOfProduct().get(i));
        }
        return drinkPriceList;
    }
}
