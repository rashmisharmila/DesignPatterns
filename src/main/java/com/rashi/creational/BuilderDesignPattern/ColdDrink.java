package com.rashi.creational.BuilderDesignPattern;

public abstract class ColdDrink implements Item{
    @Override
    public Packing Packing() {
        return new Bottle();
    }


}
