package com.rashi.creational.protoTypeDesignPatterns;

public class Square extends Shape {
    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Square(factoryDesignPatterns) method is called...!");
    }
}
