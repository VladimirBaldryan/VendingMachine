package com.company;

import java.util.LinkedHashMap;
import java.util.LinkedList;

public class Sweet extends Product {
    @Override
    public LinkedList<String> initProduct() {
        LinkedList<String> bakery = new LinkedList<>();
        bakery.add(" cookies ");
        bakery.add(" chocolate cookies ");
        bakery.add(" kex ");
        return bakery;
    }

    @Override
    public LinkedList<Integer> pricesOfProduct() {
        LinkedList<Integer> sweetPrice = new LinkedList<>();
        sweetPrice.add(350);
        sweetPrice.add(420);
        sweetPrice.add(480);
        return sweetPrice;
    }

    @Override
    public LinkedHashMap<String, Integer> priceList() {
        LinkedHashMap<String, Integer> sweetPriceList = new LinkedHashMap<>();
        for (int i = 0; i < 3; i++) {
            sweetPriceList.put(initProduct().get(i), pricesOfProduct().get(i));
        }
        return sweetPriceList;
    }
}
