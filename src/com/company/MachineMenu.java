package com.company;

import java.util.LinkedHashMap;

public class MachineMenu {
    public MachineMenu() {
    }

    public LinkedHashMap<String, String> initDrinkMenu() {
        LinkedHashMap<String, String> drinkMenu = new LinkedHashMap<>();
        SoftDrink softDrink = new SoftDrink();
        for (int i = 1; i < 4; i++) {
            drinkMenu.put("A" + i, softDrink.initProduct().get(i - 1));
        }
        return drinkMenu;
    }

    public LinkedHashMap<String, String> initSweetMenu() {
        LinkedHashMap<String, String> sweetMenu = new LinkedHashMap<>();
        Sweet sweet = new Sweet();
        for (int i = 1; i < 4; i++) {
            sweetMenu.put("B" + i, sweet.initProduct().get(i - 1));
        }
        return sweetMenu;
    }

    public LinkedHashMap<String, String> initChipsMenu() {
        LinkedHashMap<String, String> chipsMenu = new LinkedHashMap<>();
        Chips chips = new Chips();
        for (int i = 1; i < 4; i++) {
            chipsMenu.put("C" + i, chips.initProduct().get(i - 1));
        }
        return chipsMenu;
    }

    public void printProductMenu() {
        System.out.println(initDrinkMenu());
        System.out.println(initSweetMenu());
        System.out.println(initChipsMenu());
    }


    public void printProductCost() {
        SoftDrink softDrink = new SoftDrink();
        Sweet sweet = new Sweet();
        Chips chips = new Chips();
        System.out.println(softDrink.priceList());
        System.out.println(sweet.priceList());
        System.out.println(chips.priceList());
    }
}
