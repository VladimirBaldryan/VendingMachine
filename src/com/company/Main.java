package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MachineMenu vendingMachine = new MachineMenu();
        Scanner scanner = new Scanner(System.in);
        Purchase purchase = new Purchase();
        int choose;
        do {
            System.out.println("*********MENU********");
            System.out.println("1 for product Menu");
            System.out.println("2 for purchase product");
            System.out.println("3 for Exit");
            choose = scanner.nextInt();
            if (choose == 1){
                vendingMachine.printProductCost();
            }else if (choose == 2){
                vendingMachine.printProductMenu();
                System.out.println("Please Chose product");
                purchase.chooseProduct(scanner.next());
            }
            System.out.println();
        }while(choose != 3);
        purchase.printTotalCost();
    }
}
