package com.rashi.creational.protoTypeDesignPatterns;

public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }
    @Override
    public void draw() {
        System.out.println("Rectangle(factoryDesignPatterns) method is called...!");
    }
}
