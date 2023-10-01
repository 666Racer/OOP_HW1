package org.example;
//1) Создаём торговый автомат с возможностью поиска тваора по имени
//2) Делаем клосс товар абстрактным и создаём наследников

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        Product cola = new Product("Cola", 10); //добавляем новый продукт
//        Product sprite = new Product("Sprite", 12); //добавляем новый продукт
//        Product fanta = new Product("Fanta", 15); //добавляем новый продукт
//        Product pepsi = new Product("Pepsi", 14); //добавляем новый продукт
        CupOfTea cupOfTea1 = new CupOfTea("cup of Tea1",200, 90);
        CupOfTea cupOfTea2 = new CupOfTea("cup of Tea2",300, 80);
        CupOfTea cupOfTea3 = new CupOfTea("cup of Tea3",200, 80);
        //List<Product> prodList = new ArrayList<>(List.of(bottleOfCola, pieceOfCheese));
        List<CupOfTea> teaList = new ArrayList<>(List.of(cupOfTea1, cupOfTea2, cupOfTea3));

        //List.of при создании позволяет добавлять сразу несколько объектов

//        VendingMachine vendingMachine = new VendingMachine(); //соединяем с автоматом
//
//        vendingMachine.addProducts(prodList); //вывод списка продуктов
//        vendingMachine.printProduct("bottleOfCola"); //поиск продукта по названию (имени)
//        vendingMachine.printProduct("pieceOfCheese"); //поиск продукта по названию (имени)
        VendingMachineOfHotDrinks vendingMachineOfHotDrinks = new VendingMachineOfHotDrinks();
        vendingMachineOfHotDrinks.addProducts(teaList);
        vendingMachineOfHotDrinks.getProduct("cupOfTea2", 300, 80);
        vendingMachineOfHotDrinks.getProduct("cupOfTea2", 200, 80);
    }
}