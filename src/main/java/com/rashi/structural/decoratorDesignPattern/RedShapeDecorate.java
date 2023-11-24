package com.rashi.structural.decoratorDesignPattern;

public class RedShapeDecorate extends ShapeDecorator{
    public RedShapeDecorate(Shape shape) {
        super(shape);
    }

    @Override
    public void draw(){
        shape.draw();
        setRedShape(shape);
    }

    private void setRedShape(Shape redBoard){
        System.out.println("Board Colour : RED");
    }
}
