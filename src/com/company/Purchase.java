package com.company;

public class Purchase extends Product {
    public Purchase() {
    }

    public void chooseProduct(String input) {
        if (input.substring(0, 1).toUpperCase().contains("A")) {
            choseDrink(Character.getNumericValue(input.charAt(1)));
        } else if (input.substring(0, 1).toUpperCase().contains("B")) {
            choseSweet(Character.getNumericValue(input.charAt(1)));
        } else if (input.substring(0, 1).toUpperCase().contains("C")) {
            choseChips(Character.getNumericValue(input.charAt(1)));
        }
    }

    public void choseDrink(int code) {
        int sum = 0;
        SoftDrink softDrink = new SoftDrink();
        sum += softDrink.pricesOfProduct().get(code-1);
        price += sum;
    }
    public void choseSweet(int code) {
        int sum = 0;
        Sweet sweet = new Sweet();
        sum += sweet.pricesOfProduct().get(code-1);
        price += sum;
    }
    public void choseChips(int code) {
        int sum = 0;
        Chips chips = new Chips();
        sum += chips.pricesOfProduct().get(code-1);
        price += sum;
    }
    public void printTotalCost(){
        System.out.println(price);
    }
}
