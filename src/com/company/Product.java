package com.company;

import java.util.LinkedHashMap;
import java.util.LinkedList;

public abstract class Product {
    int price;

    public LinkedList<String> initProduct() {
        return new LinkedList<>();
    }
    public LinkedList<Integer> pricesOfProduct(){
        return new LinkedList<>();
    }
    public LinkedHashMap<String, Integer> priceList(){
        return new LinkedHashMap<>();
    }
}
