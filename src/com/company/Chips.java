package com.company;

import java.util.LinkedHashMap;
import java.util.LinkedList;

public class Chips extends Product{
    @Override
    public LinkedList<String> initProduct() {
        LinkedList<String> chipsTaste = new LinkedList<>();
        chipsTaste.add(" Cheese taste ");
        chipsTaste.add(" Mexican paper ");
        chipsTaste.add(" Classic ");
        return chipsTaste;
    }

    @Override
    public LinkedList<Integer> pricesOfProduct() {
        LinkedList<Integer> sweetPrice = new LinkedList<>();
        sweetPrice.add(520);
        sweetPrice.add(510);
        sweetPrice.add(450);
        return sweetPrice;
    }

    @Override
    public LinkedHashMap<String, Integer> priceList() {
        LinkedHashMap<String, Integer> chipsPriceList = new LinkedHashMap<>();
        for (int i = 0; i < 3; i++) {
            chipsPriceList.put(initProduct().get(i), pricesOfProduct().get(i));
        }
        return chipsPriceList;
    }
}
