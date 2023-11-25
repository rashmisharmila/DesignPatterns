package com.rashi.creational.BuilderDesignPattern;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item> itemList=new ArrayList<Item>();

    public void addItem(Item item){
        System.out.println("Item :"+item.name()+","+"Packing :"+item.Packing().pack());

    }



    public void showItems(){
        for (Item item:itemList){
            System.out.print("Item : "+item.name());
            System.out.print("Packing : "+item.Packing().pack());
        }
    }
}
