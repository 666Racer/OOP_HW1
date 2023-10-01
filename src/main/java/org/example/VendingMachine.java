package org.example;

import java.util.ArrayList;
import java.util.List;

public interface VendingMachine<T extends Product> {

    void addProducts(List<T> newList);
    void printProduct(String name);


//    public void addProducts(List<Product> newList) { //метод добавления продуктов
//        this.list = newList;
//        System.out.println(newList);
//    }
//
//    public void printProduct(String name) { //метод вывода продукта по имени
//        //System.out.println(list.get(list.indexOf(name)));
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i).getName().equals(name)){
//                System.out.println(list.get(i));
//            }
//        }
//    }
}
