package com.rashi.creational.BuilderDesignPattern;

public  abstract class Burger implements Item{

    @Override
    public Packing Packing() {
        return new Wrapper();
    }


}
